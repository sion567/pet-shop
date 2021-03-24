package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 *  退款信息
 */
@Setter
@Getter
@Entity
@Table(name = "T_REFUND_INFO")
public class RefundInfo extends BizEntity {
    /**
     * 退款的订单
     */
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "order_return_apply_id", referencedColumnName = "id")
    private OrderReturnApply orderReturn;
    /**
     * 退款金额
     */
    private BigDecimal refund;
    /**
     * 退款交易流水号
     */
    private String refundSn;
    /**
     * 退款状态
     */
    private Integer refundStatus;
    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    @Column(columnDefinition="tinyint")
    private Integer refundChannel;
    /**
     *
     */
    private String refundContent;
}
