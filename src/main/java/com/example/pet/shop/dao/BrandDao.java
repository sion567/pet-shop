package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.Brand;
import org.springframework.stereotype.Repository;

@Repository("brandDao")
public interface BrandDao  extends BaseRepository<Brand, Long> {
}
