package com.di1shuai.di1shuai_starter.controller;

import com.di1shuai.di1shuai_starter.enums.ErrorCode;
import com.di1shuai.di1shuai_starter.exception.BaseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Bruce
 * @date: 2020-04-22
 * @description:
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping(path = "/exception")
    public Object exceptionTest(){
        throw new BaseException(ErrorCode.NOT_FIND);
    }


}
