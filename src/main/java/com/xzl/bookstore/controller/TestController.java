//package com.xzl.bookstore.controller;
//
//import com.xzl.bookstore.annotation.SLLog;
//import com.xzl.bookstore.pojo.po.User;
//import com.xzl.bookstore.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class TestController {
//
//    @Autowired
//    UserService userService;
//
//    @GetMapping("get")
//    @SLLog
//    public ModelAndView get(ModelAndView mv, Integer id){
//        userService.get(id);
//        mv.addObject("user",userService.get(id));
//        return mv;
//    }
//}
