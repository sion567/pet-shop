package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单退货申请
 */
@Setter
@Getter
@Entity
@Table(name = "T_ORDER_RETURN_APPLY")
public class OrderReturnApply extends BizEntity {
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "order_id")
    private Order order;
    /**
     * 退货商品id
     */
    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "sku_id")
    private SkuInfo sku;
    /**
     * 退款金额
     */
    private BigDecimal returnAmount;
    /**
     * 退货人姓名
     */
    private String returnName;
    /**
     * 退货人电话
     */
    private String returnPhone;
    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer status;
    /**
     * 处理时间
     */
    private Date handleTime;
    /**
     * 商品销售属性(JSON)
     */
    private String skuAttrsVals;
    /**
     * 退货数量
     */
    private Integer skuCount;
    /**
     * 商品单价
     */
    private BigDecimal skuPrice;
    /**
     * 商品实际支付单价
     */
    private BigDecimal skuRealPrice;
    /**
     * 原因
     */
    private String reason;
    /**
     * 描述
     */
    private String description述;
    /**
     * 凭证图片，以逗号隔开
     */
    private String descPics;
    /**
     * 处理备注
     */
    private String handleNote;
    /**
     * 处理人员
     */
    private String handleMan;
    /**
     * 收货人
     */
    private String receiveMan;
    /**
     * 收货时间
     */
    private Date receiveTime;
    /**
     * 收货备注
     */
    private String receiveNote;
    /**
     * 收货电话
     */
    private String receivePhone;
    /**
     * 收货地址
     */
    private String receiveAddress;
}
