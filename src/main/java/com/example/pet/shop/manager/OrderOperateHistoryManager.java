package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.OrderOperateHistoryDao;
import com.example.pet.shop.model.OrderOperateHistory;
import org.springframework.stereotype.Service;

@Service
public class OrderOperateHistoryManager extends BaseManager<OrderOperateHistoryDao, OrderOperateHistory, Long> {
}
