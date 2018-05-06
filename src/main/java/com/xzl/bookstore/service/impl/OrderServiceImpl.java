package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.OrderItemMapper;
import com.xzl.bookstore.dao.OrderMapper;
import com.xzl.bookstore.pojo.po.Order;
import com.xzl.bookstore.pojo.po.OrderExample;
import com.xzl.bookstore.pojo.po.OrderItem;
import com.xzl.bookstore.pojo.po.OrderItemExample;
import com.xzl.bookstore.pojo.vo.OrderItemVO;
import com.xzl.bookstore.service.OrderService;
import com.xzl.bookstore.util.DataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderItemMapper orderItemMapper;

//    @Override
//    public List<OrderItemVO> selectByUserId(Integer userId) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        List<OrderItemVO> orderItemVOList = new ArrayList<>();
//        //订单项的List
//        List<OrderItem> orderItems = null;
//        OrderExample orderExample = new OrderExample();
//        OrderExample.Criteria criteria = orderExample.createCriteria();
//        criteria.andUserIdEqualTo(userId);
//        //查出所有的订单
//        List<Order> orders = orderMapper.selectByExample(orderExample);
//        if (orders.size() > 0) {
//            //有订单
//            for (int i = 0; i < orders.size(); i++) {
//                Order order = orders.get(i);
//                //订单数组
//                String orderItemIds = order.getOrderItemIds();
//                String[] orderIds = orderItemIds.split(",");
//                System.out.println("orderItem orderIds=====>" + Arrays.toString(orderIds));
//                List<Integer> integerList = new ArrayList<>();
//                for (int j = 0; j < orderIds.length; j++) {
//                    integerList.add(Integer.valueOf(orderIds[j]));
//                }
//                integerList.stream().forEach(System.out::println);
//                //去订单项中查询
//                OrderItemExample orderItemExample = new OrderItemExample();
//                OrderItemExample.Criteria criteria1 = orderItemExample.createCriteria();
//                criteria1.andIdIn(integerList);
//                orderItems = orderItemMapper.selectByExample(orderItemExample);
//
//                OrderItemVO orderItemVO = null;
//                for (int k = 0; k < orderItems.size(); k++) {
//                    orderItemVO =  new OrderItemVO();
//                    orderItemVO.setAmount(orderItems.get(k).getAmount());
//                    orderItemVO.setId(orderItems.get(k).getId());
//                    orderItemVO.setBookId(orderItems.get(k).getBookId());
//                    orderItemVO.setPrice(orderItems.get(k).getPrice());
//                    orderItemVO.setTotal(orderItems.get(k).getTotal());
//                    orderItemVO.setOrderId(orders.get(i).getId());
//                    orderItemVO.setReceiveName(orders.get(i).getReceiveName());
//                    orderItemVO.setTelephone(orders.get(i).getReceiveTelephone());
//                    orderItemVO.setStatus(orders.get(i).getStatus());
//                    orderItemVO.setUserId(orders.get(i).getUserId());
//                    orderItemVO.setSum(orders.get(i).getSum());
//                    orderItemVO.setCreateTime(sdf.format(orders.get(i).getCreateTime()));
//                    orderItemVO.setEndTime(sdf.format(orders.get(i).getEndTime()));
//                    orderItemVO.setIsDelete(orders.get(i).getIsDelete());
//                    orderItemVOList.add(orderItemVO);
//                }
//            }
//        }
//
//
//        orderItemVOList.stream().forEach(System.out::println);
//        return orderItemVOList;
//    }


//    @Override
//    public List<OrderItem> selectByUserId(List<Integer> list) {
//
//        //去订单项中查询
//        OrderItemExample orderItemExample = new OrderItemExample();
//        OrderItemExample.Criteria criteria1 = orderItemExample.createCriteria();
//        criteria1.andIdIn(list);
//        List<OrderItem> orderItems = orderItemMapper.selectByExample(orderItemExample);
//        return orderItems;
//    }

    @Override
    public List<OrderItemVO> selectOrderByUserId(Integer userId) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 存放订单和订单项的list
        List<OrderItemVO> list = new ArrayList<>();
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        //查出所有的订单
        List<Order> orders = orderMapper.selectByExample(orderExample);
        System.out.println("all order====>   " + orders);
        OrderItemVO orderItemVO = null;

        for (int i = 0; i < orders.size(); i++) {
            orderItemVO = new OrderItemVO();
            //封装参数
            orderItemVO.setId(orders.get(i).getId());
            orderItemVO.setUserId(orders.get(i).getUserId());
            orderItemVO.setIsDelete(orders.get(i).getIsDelete());
            orderItemVO.setReceiveName(orders.get(i).getReceiveName());
            orderItemVO.setStatus(orders.get(i).getStatus());
            orderItemVO.setReceiveTelephone(orders.get(i).getReceiveTelephone());
            orderItemVO.setStatus(orders.get(i).getStatus());
            orderItemVO.setSum(orders.get(i).getSum());

            orderItemVO.setCreateTimeVO(sdf.format(orders.get(i).getCreateTime()));
            orderItemVO.setEndTimeVO(sdf.format(orders.get(i).getEndTime()));
            //orderItemVO.setEndTime(orders.get(i).getEndTime());
            //orderItemVO.setCreateTime(orders.get(i).getCreateTime());
            Order order = orders.get(i);

            List<Integer> itemIds = DataUtil.stringsToList(order.getOrderItemIds());
            //订单对应的订单项 不为空的  去订单项表查询
            OrderItemExample orderItemExample = new OrderItemExample();
            OrderItemExample.Criteria criteria1 = orderItemExample.createCriteria();
            criteria1.andIdIn(itemIds);
            List<OrderItem> orderItems = orderItemMapper.selectByExample(orderItemExample);
            orderItemVO.setList(orderItems);
            list.add(orderItemVO);
        }

        //userId =1  list
        list.stream().forEach(System.out::println);
        return list;
    }

    @Override
    public Order getByOrderId(Integer orderId) {

        return null;
    }
}
