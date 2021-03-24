package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.ProductAttrValue;
import org.springframework.stereotype.Repository;

@Repository("productAttrValueDao")
public interface ProductAttrValueDao  extends BaseRepository<ProductAttrValue, Long> {
}
