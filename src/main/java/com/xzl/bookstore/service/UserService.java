package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.util.Result;

public interface UserService {

    User get(Integer id);

    Result update(User user);
}
