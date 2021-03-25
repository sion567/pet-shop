package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 秒杀活动商品关联
 */
@Setter
@Getter
public class SeckillSkuRelation extends BizEntity {
    /**
     * 活动id
     */
    private Long promotionId;
    /**
     * 活动场次id
     */
    private Long promotionSessionId;
    /**
     * 商品id
     */
    private Long skuId;
    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;
    /**
     * 秒杀总量
     */
    private BigDecimal seckillCount;
    /**
     * 每人限购数量
     */
    private BigDecimal seckillLimit;
    /**
     * 排序
     */
    private Integer seckillSort;
}
