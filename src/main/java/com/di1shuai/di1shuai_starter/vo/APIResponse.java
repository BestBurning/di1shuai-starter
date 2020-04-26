package com.di1shuai.di1shuai_starter.vo;


import com.di1shuai.di1shuai_starter.enums.APICode;
import com.di1shuai.di1shuai_starter.enums.ErrorCode;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Bruce
 * @date: 2020-04-21
 * @description:
 *
 * {
 *     "code": 1,
 *     "data":{},
 *     "error":{
 *         errorCode:1001,
 *         errorMsg:"xxxxx"
 *     }
 * }
 *
 * -------------------------
 *
 * {
 *     "code": 0,
 *     "data":{
 *         "id":1
 *     },
 *     "error":null
 * }
 */
@Data
@Accessors(chain = true)
public class APIResponse<T> {

    APICode code;

    private T data;

    private ErrorCode error;


    public static <T> APIResponse<T> error(ErrorCode errorCode){
        APIResponse<T> response = new APIResponse<>();
        response.code = APICode.ERROR;
        response.error = errorCode;
        return response;
    }

    public static <T> APIResponse<T> success(T data){
        APIResponse<T> response = new APIResponse<>();
        response.code = APICode.SUCCESS;
        response.data = data;
        return response;
    }

}
