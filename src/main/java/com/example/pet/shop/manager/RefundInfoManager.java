package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.RefundInfoDao;
import com.example.pet.shop.model.RefundInfo;
import org.springframework.stereotype.Service;

@Service
public class RefundInfoManager extends BaseManager<RefundInfoDao, RefundInfo, Long> {
}
