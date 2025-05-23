package com.edutech.accounts.controller;

import com.edutech.accounts.model.AccountUsers;
import com.edutech.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<AccountUsers> register(@Valid @RequestBody AccountUsers user) {
        return ResponseEntity.ok(accountService.register(user));
    }
}