package com.xzl.bookstore.config;

import com.xzl.bookstore.util.PropertiesUtil;

public class OSSConfig {


    //阿里云API的外网域名
    public static final String ENDPOINT = PropertiesUtil.getProperty("ENDPOINT");
    //阿里云API的密钥Access Key ID
    public static final String ACCESS_KEY_ID = PropertiesUtil.getProperty("ACCESS_KEY_ID");
    //阿里云API的密钥Access Key Secret
    public static final String ACCESS_KEY_SECRET = PropertiesUtil.getProperty("ACCESS_KEY_SECRET");
    //阿里云API的bucket名称
    public static final String BACKET_NAME = PropertiesUtil.getProperty("BACKET_NAME");
}
