package com.edutech.accounts.service;

import com.edutech.accounts.model.AccountUsers;
import com.edutech.accounts.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public AccountUsers register(AccountUsers user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return accountRepository.save(user);
    }
}
