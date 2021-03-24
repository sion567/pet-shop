package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.OrderOperateHistory;
import org.springframework.stereotype.Repository;

@Repository("orderOperateHistoryDao")
public interface OrderOperateHistoryDao  extends BaseRepository<OrderOperateHistory, Long> {
}
