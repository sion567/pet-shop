package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "T_SKU_SALE_ATTR_VALUE")
public class SkuSaleAttrValue extends BizEntity {
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional=false)
    @JoinColumn(name = "sku_id")
    private SkuInfo sku;
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "attr_id")
    private Attr attr;
    /**
     * 销售属性名
     */
    private String attrName;
    /**
     * 销售属性值
     */
    private String attrValue;
    /**
     * 顺序
     */
    private Integer attrSort;
}
