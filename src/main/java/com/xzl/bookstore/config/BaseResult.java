package com.xzl.bookstore.config;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 *  统一的返回结果集  JsonSerialize 当data为null 时候不返回
 *  {"code":1,"message":"操作成功","data":null} ----> {"code":1,"message":"操作成功"}
 *
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class BaseResult {

    /**
     *  状态码  1 成功 其他的返回值见WebConfig
     *
     */
    private int code;

    /**
     *  除了成功反回success 其他返回携带的信息见 WebConfig
     */
    private String message;

    /**
     * 数据
     */
    private Object data;

    public BaseResult(BaseResultConstant baseResultConstant){

        this.code = baseResultConstant.getCode();
        this.message = baseResultConstant.getMessage();
    }
    public BaseResult(BaseResultConstant baseResultConstant,Object data){

        this.code = baseResultConstant.getCode();
        this.message = baseResultConstant.getMessage();
        this.data = data;
    }

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
