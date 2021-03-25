package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.MemberReceiveAddressDao;
import com.example.pet.shop.model.MemberReceiveAddress;
import org.springframework.stereotype.Service;

@Service
public class MemberReceiveAddressManager extends BaseManager<MemberReceiveAddressDao, MemberReceiveAddress, Long> {
}
