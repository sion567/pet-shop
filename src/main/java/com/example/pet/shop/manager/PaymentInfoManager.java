package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.PaymentInfoDao;
import com.example.pet.shop.model.PaymentInfo;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoManager extends BaseManager<PaymentInfoDao, PaymentInfo, Long> {
}
