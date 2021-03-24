package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.SkuSaleAttrValue;
import org.springframework.stereotype.Repository;

@Repository("skuSaleAttrValueDao")
public interface SkuSaleAttrValueDao  extends BaseRepository<SkuSaleAttrValue, Long> {
}
