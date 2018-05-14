package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.util.Result;

public interface UserService {

    User getUserById(Integer id);

    Result update(User user);

    User login(User user);

    boolean registerAjax(String nickName);

    int register(User user);
}
