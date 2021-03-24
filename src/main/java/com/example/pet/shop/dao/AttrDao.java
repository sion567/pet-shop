package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.Attr;
import org.springframework.stereotype.Repository;

@Repository("attrDao")
public interface AttrDao extends BaseRepository<Attr, Long> {
}
