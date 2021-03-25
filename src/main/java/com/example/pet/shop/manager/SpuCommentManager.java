package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.SpuCommentDao;
import com.example.pet.shop.model.SpuComment;
import org.springframework.stereotype.Service;

@Service
public class SpuCommentManager extends BaseManager<SpuCommentDao, SpuComment, Long> {
}
