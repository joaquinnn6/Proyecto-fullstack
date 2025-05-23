package com.edutech.accounts.repository;

import com.edutech.accounts.model.AccountUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountUsers, Long> {
    AccountUsers findByEmail(String email);
}