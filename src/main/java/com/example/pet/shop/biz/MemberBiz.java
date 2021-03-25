package com.example.pet.shop.biz;

import com.example.pet.shop.common.base.biz.BaseBiz;
import com.example.pet.shop.manager.MemberManager;
import com.example.pet.shop.manager.MemberReceiveAddressManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class MemberBiz extends BaseBiz {
    private MemberManager memberManager;
    private MemberReceiveAddressManager memberReceiveAddressManager;

    @Autowired
    public MemberBiz(MemberManager memberManager, MemberReceiveAddressManager memberReceiveAddressManager) {
        this.memberManager = memberManager;
        this.memberReceiveAddressManager = memberReceiveAddressManager;
    }
}
