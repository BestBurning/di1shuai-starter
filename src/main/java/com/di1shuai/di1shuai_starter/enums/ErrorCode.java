package com.di1shuai.di1shuai_starter.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Bruce
 * @date: 2020-04-21
 * @description:
 */

@AllArgsConstructor
@Getter
public enum ErrorCode {

    NOT_LOGIN(4001,"未登录"),
    LOGIN_NOT_FIND(4002,"用户名密码错误"),
    NOT_FIND(4004,"资源未找到")


    ;

    private int errorCode;

    private String errorMsg;

    @JsonValue
    public Map getJson(){
        Map erroy = new HashMap();
        erroy.put("errorCode",errorCode);
        erroy.put("errorMsg",errorMsg);
        return erroy;
    }

}
