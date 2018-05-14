package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.AdvertMapper;
import com.xzl.bookstore.pojo.po.Advert;
import com.xzl.bookstore.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertServiceImpl implements AdvertService {

    @Override
    public List<Advert> findAll() {
        return advertMapper.selectByExample(null);
    }
    @Autowired
    AdvertMapper advertMapper;
}
