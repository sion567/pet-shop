package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 商品阶梯价格
 */
@Setter
@Getter
public class SkuLadder extends BizEntity {
    /**
     * spu_id
     */
    private Long skuId;
    /**
     * 满几件
     */
    private Integer fullCount;
    /**
     * 打几折
     */
    private BigDecimal discount;
    /**
     * 折后价
     */
    private BigDecimal price;
    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    private Integer addOther;
}
