package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.SkuInfo;
import org.springframework.stereotype.Repository;

@Repository("skuInfoDao")
public interface SkuInfoDao extends BaseRepository<SkuInfo, Long> {
}
