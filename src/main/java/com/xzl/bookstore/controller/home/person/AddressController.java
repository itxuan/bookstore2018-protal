package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.pojo.po.Address;
import com.xzl.bookstore.pojo.po.Order;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.service.AddressService;
import com.xzl.bookstore.service.OrderService;
import com.xzl.bookstore.service.UserService;
import com.xzl.bookstore.util.Result;
import com.xzl.bookstore.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("person")
public class AddressController {

    @Autowired
    AddressService addressService;
    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "address/list",method = RequestMethod.GET)
    public ModelAndView address(ModelAndView mv, HttpSession session){

        User user = (User)session.getAttribute("user");
        Integer userId = SessionUtil.getUserId(user);
        //测试
        userId =1;
        List<Address> addressList = addressService.searchByUserId(userId);
        mv.setViewName("person/address");
        mv.addObject("addressList",addressList);
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "address/add",method = RequestMethod.POST)
    public Result addAddress(Address address,HttpSession session){
        User user = (User)session.getAttribute("session_user");
        address.setUserId(SessionUtil.getUserId(user));
        Result result = addressService.save(address);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "address/delete",method = RequestMethod.GET)
    public Result deleteAddress(Integer id){
        Result result = addressService.delete(id);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "address/update",method = RequestMethod.POST)
    public Result updateAddress(Address address,HttpSession session){
        User user = (User)session.getAttribute("session_user");
        address.setUserId(SessionUtil.getUserId(user));
        Result result = addressService.update(address);
        return result;
    }

    @RequestMapping(value = "address/update",method = RequestMethod.GET)
    public ModelAndView get(Integer id,ModelAndView mv){
        mv.setViewName("person/address/update_address");
        mv.addObject("address",addressService.getById(id));
        return mv;
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
