package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.OrderDao;
import com.example.pet.shop.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderManager extends BaseManager<OrderDao, Order, Long> {
}
