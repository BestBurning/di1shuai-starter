package com.di1shuai.di1shuai_starter.service;

import com.di1shuai.di1shuai_starter.repository.AccountRepository;
import com.di1shuai.di1shuai_starter.entity.Account;
import com.di1shuai.di1shuai_starter.enums.ErrorCode;
import com.di1shuai.di1shuai_starter.exception.LoginException;
import com.di1shuai.di1shuai_starter.repository.AccountRepository;
import com.di1shuai.di1shuai_starter.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Bruce
 * @date: 2020-04-26
 * @description:
 */
@Service
public class LoginService {

    @Autowired
    AccountRepository accountRepository;


    public Account login(LoginVO loginVO){
        Account loginUser = accountRepository.findLogin(loginVO.getUsername(), loginVO.getPassword());
        if (loginUser==null){
            //账户名密码错误
            throw new LoginException(ErrorCode.LOGIN_NOT_FIND);
        }
        return loginUser;
    }


}
