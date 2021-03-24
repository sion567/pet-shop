package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.OrderItem;
import org.springframework.stereotype.Repository;

@Repository("orderItemDao")
public interface OrderItemDao extends BaseRepository<OrderItem, Long> {
}
