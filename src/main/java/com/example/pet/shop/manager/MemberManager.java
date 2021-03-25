package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.MemberDao;
import com.example.pet.shop.model.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberManager extends BaseManager<MemberDao, Member, Long> {
}
