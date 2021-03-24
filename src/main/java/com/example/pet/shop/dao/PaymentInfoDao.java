package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.PaymentInfo;
import org.springframework.stereotype.Repository;

@Repository("paymentInfoDao")
public interface PaymentInfoDao  extends BaseRepository<PaymentInfo, Long> {
}
