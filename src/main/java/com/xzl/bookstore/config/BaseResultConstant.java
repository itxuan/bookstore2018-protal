package com.xzl.bookstore.config;

public enum BaseResultConstant {

    SUCCESS(WebConfig.RETURN_VALUE_1, WebConfig.MESSAGE_1);

    private int code;

    private String message;

    BaseResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
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
}
