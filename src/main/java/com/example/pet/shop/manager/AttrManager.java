package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.AttrDao;
import com.example.pet.shop.model.Attr;
import org.springframework.stereotype.Service;

@Service
public class AttrManager extends BaseManager<AttrDao, Attr, Long> {
}
