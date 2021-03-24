package com.example.pet.shop.biz;

import com.example.pet.shop.dto.UserDTO;
import com.example.pet.shop.manager.AccountManager;
import com.example.pet.shop.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private AccountManager accountManager;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account acc = accountManager.findByUsername(username);
        if (acc == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new User(acc.getUsername(), acc.getPassword(),new ArrayList<>());
    }


    public Account save(UserDTO user) {
        Account newUser = new Account();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return accountManager.save(newUser);
    }
}
