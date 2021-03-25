package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.SkuInfoDao;
import com.example.pet.shop.model.SkuInfo;
import org.springframework.stereotype.Service;

@Service
public class SkuInfoManager extends BaseManager<SkuInfoDao, SkuInfo, Long> {
}
