package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.SpuComment;
import org.springframework.stereotype.Repository;

@Repository("spuCommentDao")
public interface SpuCommentDao  extends BaseRepository<SpuComment, Long> {
}
