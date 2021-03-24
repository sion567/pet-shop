package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.OrderReturnApply;
import org.springframework.stereotype.Repository;

@Repository("orderReturnApplyDao")
public interface OrderReturnApplyDao  extends BaseRepository<OrderReturnApply, Long> {
}
