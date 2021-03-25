package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Setter
@Getter
public class CouponHistory extends BizEntity {
    /**
     * 优惠券id
     */
    private Long couponId;
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * 会员名字
     */
    private String memberNickName;
    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    @Column(columnDefinition="tinyint")
    private Integer getType;
    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    @Column(columnDefinition="tinyint")
    private Integer useType;
    /**
     * 使用时间
     */
    private Date useTime;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 订单号
     */
    private Long orderSn;
}
