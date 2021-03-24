package com.example.pet.shop.model;


import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "T_SKU_INFO")
public class SkuInfo extends BizEntity {
    /**
     * spuId
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "spu_id")
    private SpuInfo spu;
    /**
     * sku编号
     */
    private String skuSn;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * sku介绍描述
     */
    private String skuDesc;
    /**
     * 标题
     */
    private String skuTitle;
    /**
     * 副标题
     */
    private String skuSubtitle;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 销量
     */
    private Long saleCount;

    @OneToMany(mappedBy = "sku", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SkuImages> images = new ArrayList<>();

    @OneToMany(mappedBy = "spu", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SpuComment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "sku", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<WareSku> wareSkus = new ArrayList<>();
}
