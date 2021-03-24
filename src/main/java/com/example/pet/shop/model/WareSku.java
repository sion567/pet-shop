package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "T_WARE_SKU")
public class WareSku extends BizEntity {
    /**
     * sku_id
     */
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional=false)
    @JoinColumn(name = "sku_id")
    private SkuInfo sku;
    /**
     * 仓库id
     */
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional=false)
    @JoinColumn(name = "ware_id")
    private WareInfo ware;
    /**
     * 库存数
     */
    private Integer stock;
    /**
     * 锁定库存
     */
    private Integer stockLocked;
}
