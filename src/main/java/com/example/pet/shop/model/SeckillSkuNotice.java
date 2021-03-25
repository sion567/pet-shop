package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

/**
 * 秒杀商品通知订阅
 */
@Setter
@Getter
public class SeckillSkuNotice extends BizEntity {
    /**
     * member_id
     */
    private Long memberId;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * 活动场次id
     */
    private Long sessionId;
    /**
     * 订阅时间
     */
    private Date subcribeTime;
    /**
     * 发送时间
     */
    private Date sendTime;
    /**
     * 通知方式[0-短信，1-邮件]
     */
    @Column(columnDefinition="tinyint")
    private Integer noticeType;
}
