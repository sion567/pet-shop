package com.example.pet.shop.dao;

import com.example.pet.shop.common.base.repository.BaseRepository;
import com.example.pet.shop.model.Account;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public interface AccountDao extends BaseRepository<Account, Long> {

    Account findByEmail(String email);
}
