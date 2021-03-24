package com.example.pet.shop.manager;

import com.example.pet.shop.common.base.manager.BaseManager;
import com.example.pet.shop.dao.AccountDao;
import com.example.pet.shop.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountManager extends BaseManager<AccountDao, Account, Long> {
    public Account findByUsername(String name) {
       return null;
    }
}
