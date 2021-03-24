package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "T_ORDER")
public class Order extends BizEntity {

    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "member_id")
    private Member member;
    /**
     * 订单号
     */
    private String orderSn;
    /**
     * 订单总额
     */
    private BigDecimal totalAmount;
    /**
     * 应付总额
     */
    private BigDecimal payAmount;
    /**
     * 运费金额
     */
    private BigDecimal freightAmount;
    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    private BigDecimal promotionAmount;
    /**
     * 积分抵扣金额
     */
    private BigDecimal integrationAmount;
    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;
    /**
     * 后台调整订单使用的折扣金额
     */
    private BigDecimal discountAmount;
    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    @Column(columnDefinition="tinyint")
    private Integer payType;
    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer sourceType;
    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer status;
    /**
     * 物流公司(配送方式)
     */
    private String deliveryCompany;
    /**
     * 物流单号
     */
    private String deliverySn;
    /**
     * 自动确认时间（天）
     */
    private Integer autoConfirmDay;

    /**
     * 收货人姓名
     */
    private String receiverName;
    /**
     * 收货人电话
     */
    private String receiverPhone;
    /**
     * 收货人邮编
     */
    private String receiverPostCode;
    /**
     * 省份/直辖市
     */
    private String receiverProvince;
    /**
     * 城市
     */
    private String receiverCity;
    /**
     * 区
     */
    private String receiverRegion;
    /**
     * 详细地址
     */
    private String receiverDetailAddress;
    /**
     * 订单备注
     */
    private String note;
    /**
     * 确认收货状态[0->未确认；1->已确认]
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer confirmStatus;
    /**
     * 发货时间
     */
    private Date deliveryTime;
    /**
     * 确认收货时间
     */
    private Date receiveTime;
    /**
     * 评价时间
     */
    private Date commentTime;

    private OrderBill orderBill;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "tradeNo")
    private PaymentInfo paymentInfo;

    @OneToMany(mappedBy = "order", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<OrderReturnApply> orderReturnApplys = new ArrayList<>();
    @OneToMany(mappedBy = "order", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<OrderItem> orderItems = new ArrayList<>();
    @OneToMany(mappedBy = "order", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<OrderOperateHistory> histories = new ArrayList<>();
}
