package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.WareSkuDao;
import com.example.pet.shop.model.WareSku;
import org.springframework.stereotype.Service;

@Service
public class WareSkuManager extends BaseManager<WareSkuDao, WareSku, Long> {
}
