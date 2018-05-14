package com.xzl.bookstore.util;

import com.xzl.bookstore.pojo.po.User;

public class SessionUtil {


    public static Integer getUserId(User user){
        if(user != null) {
            return user.getId();
        }
        return 0;
    }
}
