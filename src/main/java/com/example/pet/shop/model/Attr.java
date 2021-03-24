package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "T_ATTR")
public class Attr extends BizEntity {
    /**
     * 属性名
     */
    private String attrName;
    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    @Column(columnDefinition="tinyint default 1")
    private Integer searchType;
    /**
     * 属性图标
     */
    private String icon;
    /**
     * 可选值列表[用逗号分隔]
     */
    private String valueSelect;
    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    private Integer attrType;
    /**
     * 所属分类
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "catalog_id")
    private Category catelog;
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer quickShow;

    @OneToMany(mappedBy = "attr")
    private List<AttrAttrGroupRelation> relationList = new ArrayList<>();

    @OneToMany(mappedBy = "attr", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<ProductAttrValue> productAttrValueList = new ArrayList<>();

    @OneToMany(mappedBy = "attr", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SkuSaleAttrValue> skuSaleAttrValueList = new ArrayList<>();
}
