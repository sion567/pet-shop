package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 商品spu积分设置
 */
@Setter
@Getter
public class SpuBounds extends BizEntity {
    /**
     *
     */
    private Long spuId;
    /**
     * 成长积分
     */
    private BigDecimal growBounds;
    /**
     * 购物积分
     */
    private BigDecimal buyBounds;
    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    private Integer work;
}
