package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import com.example.pet.shop.common.valid.AddGroup;
import com.example.pet.shop.common.valid.IntListValue;
import com.example.pet.shop.common.valid.UpdateGroup;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "T_BRAND")
public class Brand extends BizEntity {
    /**
     * 品牌名
     */
    @NotBlank(message = "品牌名必须提交且有效", groups = AddGroup.class)
    private String name;
    /**
     * 品牌logo地址
     */
    @NotEmpty(message = "logo必须提交且有效", groups = AddGroup.class)
    @URL(message = "logo必须是一个合法的URL地址", groups = {AddGroup.class, UpdateGroup.class}) // 新增/修改时都要生效
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 检索首字母
     */
    @NotNull(message = "检索首字母必须提交且有效", groups = AddGroup.class)
    @Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是一个字母", groups = {AddGroup.class, UpdateGroup.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(message = "排序必须提交")
    @Min(value = 0, message = "排序必须大于等于0", groups = {AddGroup.class, UpdateGroup.class})
    private Integer sort;

    @ManyToMany(mappedBy = "brandList")
    private List<Category> categoryList = new ArrayList<>();

    @OneToMany(mappedBy = "brand", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SpuInfo> spuInfos = new ArrayList<>();


}
