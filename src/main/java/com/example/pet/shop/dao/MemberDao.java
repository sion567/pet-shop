package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.Member;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public interface MemberDao  extends BaseRepository<Member, Long> {
}
