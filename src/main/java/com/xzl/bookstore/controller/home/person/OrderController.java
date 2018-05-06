package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.pojo.vo.OrderItemVO;
import com.xzl.bookstore.service.OrderService;
import com.xzl.bookstore.util.SessionUtil;
import com.xzl.bookstore.util.TimeConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.util.*;

@Controller
@RequestMapping("person")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "order/list",method = RequestMethod.GET)
    public ModelAndView order(ModelAndView mv, HttpSession session){
        User sessionUser = (User)session.getAttribute("user");
        Integer userId = SessionUtil.getUserId(sessionUser);
        //todo
        userId =1;
//        List<OrderItemVO> orders = orderService.selectOrderByUserId(userId);

//        System.out.println("=====>orders:  "+ orders);

//        mv.addObject("list",orders);
        mv.setViewName("person/order");

        return mv;
    }

    @RequestMapping(value = "orderInfo",method = RequestMethod.GET)
    public ModelAndView orderInfo(ModelAndView mv){
        mv.setViewName("person/orderInfo");
        return mv;
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class, new TimeConvertUtil());
    }

    private User getCurrentUser(){
        User sessionUser = (User)session.getAttribute("session_user");
        if(sessionUser == null){
            return null;
        }
        return sessionUser;
    }
    @Autowired
    HttpSession session;

}
