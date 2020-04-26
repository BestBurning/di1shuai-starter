package com.di1shuai.di1shuai_starter.exception;

import com.di1shuai.di1shuai_starter.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Bruce
 * @date: 2020-04-22
 * @description:
 */
@Data
@AllArgsConstructor
public class BaseException extends RuntimeException  {


    protected ErrorCode errorCode;


}
