package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "T_SKU_IMAGES")
public class SkuImages extends BizEntity {

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional=false)
    @JoinColumn(name = "sku_id")
    private SkuInfo sku;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 排序
     */
    private Integer imgSort;
    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer defaultImg;
}
