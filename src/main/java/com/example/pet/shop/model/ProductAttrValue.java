package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "T_PRODUCT_ATTR_VALUE")
public class ProductAttrValue extends BizEntity {
    /**
     * 商品id
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "spu_id")
    private SpuInfo spu;
    /**
     * 属性id
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "attr_id")
    private Attr attr;
    /**
     * 属性名
     */
    private String attrName;
    /**
     * 属性值
     */
    private String attrValue;
    /**
     * 顺序
     */
    private Integer attrSort;
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer quickShow;
}
