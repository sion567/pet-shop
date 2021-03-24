package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.RefundInfo;
import org.springframework.stereotype.Repository;

@Repository("refundInfoDao")
public interface RefundInfoDao  extends BaseRepository<RefundInfo, Long> {
}
