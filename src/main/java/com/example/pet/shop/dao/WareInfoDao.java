package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.WareInfo;
import org.springframework.stereotype.Repository;

@Repository("wareInfoDao")
public interface WareInfoDao  extends BaseRepository<WareInfo, Long> {
}
