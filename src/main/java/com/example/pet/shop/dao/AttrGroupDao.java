package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.AttrGroup;
import org.springframework.stereotype.Repository;

@Repository("AttrGroupDao")
public interface AttrGroupDao  extends BaseRepository<AttrGroup, Long> {
}
