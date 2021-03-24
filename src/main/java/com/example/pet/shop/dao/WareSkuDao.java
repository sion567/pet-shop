package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.WareSku;
import org.springframework.stereotype.Repository;

@Repository("wareSkuDao")
public interface WareSkuDao  extends BaseRepository<WareSku, Long> {
}
