package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.Order;
import org.springframework.stereotype.Repository;

@Repository("orderDao")
public interface OrderDao  extends BaseRepository<Order, Long> {
}
