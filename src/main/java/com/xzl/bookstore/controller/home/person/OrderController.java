package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.pojo.po.Address;
import com.xzl.bookstore.pojo.po.Order;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.service.AddressService;
import com.xzl.bookstore.service.BookService;
import com.xzl.bookstore.service.OrderService;
import com.xzl.bookstore.util.SessionUtil;
import com.xzl.bookstore.util.TimeConvertUtil;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.*;

@Controller
@RequestMapping("person")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @ResponseBody
    @PostMapping(value = "cartBalance")
    public Object balanceCart(@RequestParam(value = "ids") List<Integer> ids
            , @RequestParam(value = "amounts")List<Integer> amounts){
        Map<String,Object> map = new  HashMap<>();
        logger.info("{ "+getCurrentUser().getNickname()+"时间" +LocalDateTime.now() + "下单书籍编号" + ids +",数量"+ amounts);

        Map<String, Object> order = orderService.createOrder(ids, amounts, getCurrentUserId());
        return order;
    }

    public String pay(Order order,@RequestParam(value = "ids") List<Integer> ids
            , @RequestParam(value = "amounts")List<Integer> amounts){


        return "person/paySuccess";
    }
    /**
     *
     * @param mv
     * @param session
     * @return
     */
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

    /**
     *  下单页面
     * @return
     */
    @RequestMapping(value = "pay",method = RequestMethod.GET)
    public String toPay(Model model,Integer order){
        logger.info("对编号为"+order+"订单完善");

        Integer currentUserId = getCurrentUserId();
        List<Address> addressList = addressService.searchByUserId(currentUserId);
        Map<String,Object> map = orderService.selectOrderAndOrderItemByOrderId(order);
        model.addAttribute("orderItemVOList",map.get("orderItemVOList"));
        model.addAttribute("order",map.get("order"));
        model.addAttribute("addressList",addressList);
        if(addressList!= null && addressList.size()>0){
            model.addAttribute("defaultAddress",addressList.get(0));
        }else {
            model.addAttribute("defaultAddress",new Address());
        }
        return "person/pay";
    }

    @RequestMapping(value = "paySuccess",method = RequestMethod.POST)
    public String toPaySuccess(){
        return "person/paySuccess";
    }

    private User getCurrentUser(){
        User sessionUser = (User)session.getAttribute("session_user");
        if(sessionUser != null){
            return sessionUser;
        }
        return null;
    }
    private Integer getCurrentUserId(){
        User sessionUser = (User)session.getAttribute("session_user");
        if(sessionUser != null){
            return sessionUser.getId();
        }
        return null;
    }
    @Autowired
    HttpSession session;
    @Autowired
    OrderService orderService;
    @Autowired
    BookService bookService;
    @Autowired
    AddressService addressService;
}
