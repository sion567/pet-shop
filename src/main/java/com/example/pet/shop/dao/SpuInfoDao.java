package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.SpuInfo;
import org.springframework.stereotype.Repository;

@Repository("spuInfoDao")
public interface SpuInfoDao extends BaseRepository<SpuInfo, Long> {
}
