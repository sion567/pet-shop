package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "T_PAYMENT_INFO")
public class PaymentInfo extends BizEntity {
    /**
     * 交易流水号
     */
    private String tradeNo;
    /**
     * 支付总金额
     */
    private BigDecimal totalAmount;
    /**
     * 交易内容
     */
    private String subject;
    /**
     * 支付时间
     */
    private Date paymentTime;
    /**
     * 支付状态
     */
    private String paymentStatus;
    /**
     * 确认时间
     */
    private Date confirmTime;
    /**
     * 回调内容
     */
    private String callbackContent;
    /**
     * 回调时间
     */
    private Date callbackTime;
}
