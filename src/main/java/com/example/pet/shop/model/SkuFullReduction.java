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
public class SkuFullReduction extends BizEntity {
    /**
     * spu_id
     */
    private Long skuId;
    /**
     * 满多少
     */
    private BigDecimal fullPrice;
    /**
     * 减多少
     */
    private BigDecimal reducePrice;
    /**
     * 是否参与其他优惠
     */
    private Integer addOther;
}
