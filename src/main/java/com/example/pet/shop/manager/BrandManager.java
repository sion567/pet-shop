package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.BrandDao;
import com.example.pet.shop.model.Brand;
import org.springframework.stereotype.Service;

@Service
public class BrandManager extends BaseManager<BrandDao, Brand, Long> {
}
