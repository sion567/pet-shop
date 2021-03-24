package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "T_CATEGORY")
@NamedQueries({
   @NamedQuery(name="Category.findAll", query="SELECT c FROM Category c"),
   @NamedQuery(name="Category.findByName", query="SELECT c FROM Category c WHERE c.name = :name"),
})
public class Category extends BizEntity {
    /**
     * 分类名称
     */
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category parentCategory;
    @OneToMany(mappedBy = "parentCategory", targetEntity = Category.class, cascade = CascadeType.ALL)
    private Set<Category> childCategories = new HashSet<>();

    /**
     * 层级
     */
    private Integer catLevel;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 图标地址
     */
    private String icon;
    /**
     * 计量单位
     */
    private String productUnit;
    /**
     * 商品数量
     */
    private Integer productCount;

    @OneToMany(mappedBy = "catalog", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SpuInfo> spuInfoList = new ArrayList<>();

    @OneToMany(mappedBy = "catelog", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Attr> attrList = new ArrayList<>();
    @OneToMany(mappedBy = "catelog", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<AttrGroup> attrGroupList = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.MERGE })
    @JoinTable(name = "T_CATEGORY_BRAND", joinColumns = { @JoinColumn(name = "category_id") }, inverseJoinColumns = {
            @JoinColumn(name = "brand_id") })
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("id ASC")
    private List<Brand> brandList = new ArrayList();

    /** 添加子类别 */
    public void addChildCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("Can't add a null Category as child.");
        }
        // 删除旧的父类别Category
        if (category.getParentCategory() != null) {
            category.getParentCategory().getChildCategories().remove(category);
        }
        // 设置新的父类别Category
        category.setParentCategory(this);
        // 向当前Category对象中加入子类别
        this.getChildCategories().add(category);
    }
}
