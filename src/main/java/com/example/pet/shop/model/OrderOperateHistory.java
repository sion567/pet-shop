package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "T_ORDER_OPERATE_HISTORY")
public class OrderOperateHistory extends BizEntity {

    @ManyToOne(cascade = { CascadeType.MERGE,CascadeType.REFRESH}, optional=false)
    @JoinColumn(name = "order_id")
    private Order order;
    /**
     * 操作人[用户；系统；后台管理员]
     */
    private String operateMan;
    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    @Column(columnDefinition="tinyint default 0")
    private Integer orderStatus;
    /**
     * 备注
     */
    private String note;
}
