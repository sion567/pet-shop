package com.example.pet.shop.biz;

import com.example.pet.shop.common.base.biz.BaseBiz;
import com.example.pet.shop.manager.WareInfoManager;
import com.example.pet.shop.manager.WareSkuManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class WareBiz extends BaseBiz {
    private WareInfoManager wareInfoManager;
    private WareSkuManager wareSkuManager;

    @Autowired
    public WareBiz(WareInfoManager wareInfoManager, WareSkuManager wareSkuManager) {
        this.wareInfoManager = wareInfoManager;
        this.wareSkuManager = wareSkuManager;
    }
}
