package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.WareInfoDao;
import com.example.pet.shop.model.WareInfo;
import org.springframework.stereotype.Service;

@Service
public class WareInfoManager extends BaseManager<WareInfoDao, WareInfo, Long> {
}
