package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Setter
@Getter
public class WareOrderTask extends BizEntity {
    /**
     * order_id
     */
    private Long orderId;
    /**
     * order_sn
     */
    private String orderSn;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 收货人电话
     */
    private String consigneeTel;
    /**
     * 配送地址
     */
    private String deliveryAddress;
    /**
     * 订单备注
     */
    private String orderComment;
    /**
     * 付款方式【 1:在线付款 2:货到付款】
     */
    @Column(columnDefinition="tinyint")
    private Integer paymentWay;
    /**
     * 任务状态
     */
    private Integer taskStatus;
    /**
     * 订单描述
     */
    private String orderBody;
    /**
     * 物流单号
     */
    private String trackingNo;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 工作单备注
     */
    private String taskComment;
}
