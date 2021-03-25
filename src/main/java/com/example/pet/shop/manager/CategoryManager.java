package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.CategoryDao;
import com.example.pet.shop.model.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryManager extends BaseManager<CategoryDao, Category, Long> {
}
