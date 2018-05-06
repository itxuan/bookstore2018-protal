package com.xzl.bookstore.controller.home;

import com.xzl.bookstore.util.TimeConvertUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

//@RequestMapping("home")
@Controller
public class HomeController {

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String toIndex(){
        return "home/index";
    }

    @RequestMapping(value = "paySuccess",method = RequestMethod.POST)
    public String toPaySuccess(){
        return "home/paySuccess";
    }

    @RequestMapping(value = "detail",method = RequestMethod.GET)
    public String bookDetail(){
        return "home/detail";
    }

    @RequestMapping(value = "pay",method = RequestMethod.GET)
    public String toPay(){
        return "home/pay";
    }

    @RequestMapping(value = "search")
    public String toSearch(){
        return "home/search";
    }

    @RequestMapping(value = "cart",method = RequestMethod.GET)
    public String toCart(){
        return "home/cart";
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String userLoginPage(){
        return "home/login";
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String toRegister(){
        return "home/register";
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class, new TimeConvertUtil());
    }
}
