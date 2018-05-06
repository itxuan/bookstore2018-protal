package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.UserMapper;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.service.UserService;
import com.xzl.bookstore.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User get(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
    @Override
    public Result update(User user) {

        int count = userMapper.updateByPrimaryKeySelective(user);
        if(count == 1) {
            return new Result(true);
        }else {
            return new Result(false);
        }
    }
}
