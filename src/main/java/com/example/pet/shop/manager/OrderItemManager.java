package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.OrderItemDao;
import com.example.pet.shop.model.OrderItem;
import org.springframework.stereotype.Service;

@Service
public class OrderItemManager extends BaseManager<OrderItemDao, OrderItem, Long> {
}
