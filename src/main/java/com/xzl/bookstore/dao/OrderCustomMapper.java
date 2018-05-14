package com.xzl.bookstore.dao;

import com.xzl.bookstore.pojo.po.Order;

public interface OrderCustomMapper {

    int customInsertSelective(Order order);
}
