package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.MemberReceiveAddress;
import org.springframework.stereotype.Repository;

@Repository("memberReceiveAddressDao")
public interface MemberReceiveAddressDao  extends BaseRepository<MemberReceiveAddress, Long> {
}
