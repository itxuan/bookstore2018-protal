package com.xzl.bookstore.util;

public class Result {

    private Object data;

    private boolean success;

    private String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Result() {
    }

    public Result(boolean success) {
        this.success = success;
    }

    public Result(Object data) {
        this.data = data;
    }

    public Result(String message) {
        this.message = message;
    }

    public Result(Object data, boolean success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
    }
}
