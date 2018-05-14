package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.po.Order;
import com.xzl.bookstore.pojo.vo.OrderItemVO;

import java.util.List;
import java.util.Map;

public interface OrderService {


//    List<OrderItem>selectByUserId(List<Integer> list);

    List<OrderItemVO> selectOrderByUserId(Integer userId);

    Order getByOrderId(Integer orderId);

    Map<String,Object> createOrder(List<Integer> ids, List<Integer> amounts, Integer userId);

    Map<String,Object> selectOrderAndOrderItemByOrderId(Integer orderId);
}
