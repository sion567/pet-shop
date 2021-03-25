package com.example.pet.shop.biz;

import com.example.pet.shop.common.base.biz.BaseBiz;
import com.example.pet.shop.manager.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class OrderBiz extends BaseBiz {
    private OrderManager orderManager;
    private OrderItemManager orderItemManager;
    private OrderOperateHistoryManager orderOperateHistoryManager;
    private OrderReturnApplyManager orderReturnApplyManager;
    private PaymentInfoManager paymentInfoManager;
    private RefundInfoManager refundInfoManager;

    @Autowired
    public OrderBiz(OrderManager orderManager,
                    OrderItemManager orderItemManager,
                    OrderOperateHistoryManager orderOperateHistoryManager,
                    OrderReturnApplyManager orderReturnApplyManager,
                    PaymentInfoManager paymentInfoManager,
                    RefundInfoManager refundInfoManager) {
        this.orderManager = orderManager;
        this.orderItemManager = orderItemManager;
        this.orderOperateHistoryManager = orderOperateHistoryManager;
        this.orderReturnApplyManager = orderReturnApplyManager;
        this.paymentInfoManager = paymentInfoManager;
        this.refundInfoManager = refundInfoManager;
    }
}
