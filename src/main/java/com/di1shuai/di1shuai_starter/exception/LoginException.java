package com.di1shuai.di1shuai_starter.exception;


import com.di1shuai.di1shuai_starter.enums.ErrorCode;

/**
 * @author: Bruce
 * @date: 2020-04-26
 * @description:
 */
public class LoginException extends BaseException{

    public LoginException(ErrorCode errorCode) {
        super(errorCode);
    }

}
