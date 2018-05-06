package com.xzl.bookstore.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);
    private static Properties props;
    static{
        loadProps();
    }

    synchronized static private void loadProps(){
        logger.info("开始加载oss.properties文件内容.......");
        props = new Properties();
        InputStream in = null;
        try {
//　　　　　　　<!--第一种，通过类加载器进行获取properties文件流-->
            in = PropertiesUtil.class.getClassLoader().getResourceAsStream("oss.properties");
//　　　　　　  <!--第二种，通过类进行获取properties文件流-->
            //in = PropertyUtil.class.getResourceAsStream("/jdbc.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            logger.error("oss.properties文件未找到");
        } catch (IOException e) {
            logger.error("出现IOException");
        } finally {
            try {
                if(null != in) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error("oss.properties文件流关闭出现异常");
            }
        }
        logger.info("加载oss.properties文件内容完成...........");
        logger.info("oss.properties文件内容：" + props);
    }

    public static String getProperty(String key){
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }


    public static String getProperty(String key, String defaultValue) {
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key, defaultValue);
    }
//    public static void main(String[] args) {
//        System.out.println("main");
//        System.out.println(getProperty("BACKET_NAME"));
//    }
}
