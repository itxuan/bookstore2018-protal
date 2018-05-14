package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.UserMapper;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.pojo.po.UserExample;
import com.xzl.bookstore.service.UserService;
import com.xzl.bookstore.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User getUserById(Integer id) {
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

    @Override
    public User login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNicknameEqualTo(user.getNickname()).andPasswordEqualTo(user.getPassword());
        try {
            List<User> users = userMapper.selectByExample(userExample);
            if(users != null && users.size()> 0){
                return users.get(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean registerAjax(String nickName) {

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNicknameEqualTo(nickName);
        List<User> users = userMapper.selectByExample(userExample);
        if(users!=null && users.size()>0){
            return false;
        }
        return true;
    }

    @Override
    public int register(User user) {
        return userMapper.insertSelective(user);
    }

    @Autowired
    UserMapper userMapper;
}
