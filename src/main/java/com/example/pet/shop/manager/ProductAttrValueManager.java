package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.ProductAttrValueDao;
import com.example.pet.shop.model.ProductAttrValue;
import org.springframework.stereotype.Service;

@Service
public class ProductAttrValueManager extends BaseManager<ProductAttrValueDao, ProductAttrValue, Long> {
}
