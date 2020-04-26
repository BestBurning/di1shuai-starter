package com.di1shuai.di1shuai_starter.config;

import com.di1shuai.di1shuai_starter.exception.BaseException;
import com.di1shuai.di1shuai_starter.exception.LoginException;
import com.di1shuai.di1shuai_starter.vo.APIResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: Bruce
 * @date: 2020-04-22
 * @description:
 */
@EnableWebMvc
@Configuration
public class ExceptionConfig {

    @RestControllerAdvice("com.di1shuai.di1shuai_starter.controller")
    static class UnifiedExceptionHandler{

        @ExceptionHandler({BaseException.class,LoginException.class})
        public APIResponse<Void> handleException(BaseException be){
            return APIResponse.error(be.getErrorCode());
        }
    }

}
