package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "T_ORDER_ITEM")
public class OrderItem extends BizEntity {

    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "order_id")
    private Order order;
    /**
     * order_sn
     */
    private String orderSn;
    /**
     * 商品sku编号
     */
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "sku_sn", referencedColumnName = "skuSn")
    private SkuInfo sku;
    /**
     * 商品sku价格
     */
    private BigDecimal skuPrice;
    /**
     * 商品购买的数量
     */
    private Integer skuQuantity;
    /**
     * 商品销售属性组合（JSON）
     */
    private String skuAttrsVals;
}
