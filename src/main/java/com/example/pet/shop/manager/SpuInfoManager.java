package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.SpuInfoDao;
import com.example.pet.shop.model.SpuInfo;
import org.springframework.stereotype.Service;

@Service
public class SpuInfoManager extends BaseManager<SpuInfoDao, SpuInfo, Long> {
}
