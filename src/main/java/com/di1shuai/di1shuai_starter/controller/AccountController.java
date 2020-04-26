package com.di1shuai.di1shuai_starter.controller;

import com.di1shuai.di1shuai_starter.entity.Account;
import com.di1shuai.di1shuai_starter.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Bruce
 * @date: 2020-04-20
 * @description:
 */
@RequestMapping("/account")
@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping(path = "/{id}")
    public Account getById(@PathVariable Long id){
        return accountRepository.findById(id).get();
    }

}
