package com.xzl.bookstore.util;

import com.xzl.bookstore.config.WebConfig;
import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

    /**
     * 适用web 环境 根据HttpServletRequest对象获取代理之前的Ip
     *
     * @param request
     * @return
     */

    public static String getClientIp(HttpServletRequest request) {

        String client_ip = request.getHeader("x-forwarded-for");
        if (client_ip == null || client_ip.length() == 0 || "unknown".equalsIgnoreCase(client_ip)) {
            client_ip = request.getHeader("Proxy-Client-IP");
        }
        if (client_ip == null || client_ip.length() == 0 || "unknown".equalsIgnoreCase(client_ip)) {
            client_ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (client_ip == null || client_ip.length() == 0 || "unknown".equalsIgnoreCase(client_ip)) {
            client_ip = request.getRemoteAddr();
            if (client_ip.equals("127.0.0.1") || client_ip.equals("0:0:0:0:0:0:0:1")) {
                //根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                client_ip = inet.getHostAddress();
            }
        }
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (client_ip != null && client_ip.length() > 15) { //"***.***.***.***".length() = 15
            if (client_ip.indexOf(",") > 0) {
                client_ip = client_ip.substring(0, client_ip.indexOf(","));
            }
        }
        return client_ip;
    }

    /**
     * 判断参数是否为空  非空为ture
     *
     * @param args
     * @return
     */
    public static boolean checkNull(Object[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("parameter." + i + " ==> " + args[i]);
            if (args[i] == null || args[i].toString().length() < 1 || args[i].toString().trim().equals("")) {
                System.out.println("args[i];" + args[i]);
                return false;
            }
            if (args[i].toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * 生成订单号的方式  参考: https://blog.csdn.net/shuaizai88/article/details/53566425
     */

    public static String generateOrderNumber() {
        DateFormat format = new SimpleDateFormat("yyMMddHHmmss");
        String orderNumber = WebConfig.ORDER_PREFIX + format;
        return orderNumber;
    }

    public final static String MD5(String s) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str).toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String dateTimeToString(Date date){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        return format;
    }

    public static String dateToString(Date date){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    public static Date stringFormat(String format){
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return  sdf1.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Date stringFormatDateTime(String format){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return  sdf.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final String key = "bookstore";
}
