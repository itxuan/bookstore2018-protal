package com.xzl.bookstore.config;

/**
 * 全局的配置文件
 */
public class WebConfig {

    //OSS地址
    public static final String OSS_IMAGE_URL =
    "http://xuanzhongliang.oss-cn-shanghai.aliyuncs.com/";

    public static final int RETURN_VALUE_1 = 1;
    public static final int RETURN_VALUE_2 = 2;
    public static final int RETURN_VALUE_3 = 3;
    public static final int RETURN_VALUE_4 = 4;
    public static final int RETURN_VALUE_6 = 6;
    public static final int RETURN_VALUE_ERROR = 403;
    public static final int RETURN_VALUE_500 = 500;
    public static final int RETURN_VALUE_EMPTY_DATA = 99;
    public static final String MESSAGE_1 = "操作成功";
    public static final String MESSAGE_2 = "参数错误";
    public static final String MESSAGE_ERROR="账号与密码不匹配";
    /*一般是服务器 500*/

    public static final String MESSAGE_500 = "服务器异常";
    public static final String MESSAGE_4 = "账户已经被注册";
    public static final String MESSAGE_5 = "账户被禁用";
    public static final String MESSAGE_6 = "用户不存在";
    public static final String MESSAGE_7 = "手机号码格式错误";
    public static final String MESSAGE_8 = "验证码错误";
    public static final String MESSAGE_EMPTY_DATA = "无数据";
    //订单前缀
    public static final String ORDER_PREFIX = "NO.";
}
