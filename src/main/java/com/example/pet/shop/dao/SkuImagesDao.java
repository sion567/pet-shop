package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.SkuImages;
import org.springframework.stereotype.Repository;

@Repository("skuImagesDao")
public interface SkuImagesDao  extends BaseRepository<SkuImages, Long> {
}
