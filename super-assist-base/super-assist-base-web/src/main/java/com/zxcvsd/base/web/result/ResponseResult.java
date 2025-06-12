package com.zxcvsd.base.web.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一响应体
 * @param <T>
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {

    //响应码
    private Integer code;
    //请求是否成功
    private Boolean success;
    //响应信息
    private String message;
    //响应数据
    private T data;

    private static final int success_code = 20000;
    private static final int fail_code = 50000;

    public static<T> ResponseResult<T> success() {
        return new ResponseResult<T>(success_code, true, "ok", null);
    }

    public static<T> ResponseResult<T> success(T data) {
        return new ResponseResult<T>(success_code, true, "ok", data);
    }

    public static<T> ResponseResult<T> success(int code, Boolean flag, String message, T data) {
        return new ResponseResult<>(code, flag, message, data);
    }

    public static<T> ResponseResult<T> fail(){
        return new ResponseResult<T>(fail_code, false, "fail", null);
    }

    public static<T> ResponseResult<T> fail(String message){
        return new ResponseResult<T>(fail_code, false, message, null);
    }

    public static<T> ResponseResult<T> fail(Integer errorCode, String message){
        return new ResponseResult<>(errorCode,false,message,null);
    }

    public static<T> ResponseResult<T> fail (Exception e){
        return new ResponseResult<>(fail_code,false, e.getMessage(), null);
    }

}
