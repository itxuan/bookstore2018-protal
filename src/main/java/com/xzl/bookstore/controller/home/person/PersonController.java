package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.service.UserService;
import com.xzl.bookstore.util.SessionUtil;
import com.xzl.bookstore.util.TimeConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("person")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @RequestMapping(value = "bill",method = RequestMethod.GET)
    public ModelAndView bill(ModelAndView mv){
        mv.setViewName("person/bill");
        return mv;
    }

    @RequestMapping(value = "billList",method = RequestMethod.GET)
    public ModelAndView billList(ModelAndView mv){
        mv.setViewName("person/billList");
        return mv;
    }

    @RequestMapping(value = "bonus",method = RequestMethod.GET)
    public ModelAndView bonus(ModelAndView mv){
        mv.setViewName("person/bonus");
        return mv;
    }

    @RequestMapping(value = "refundManage",method = RequestMethod.GET)
    public ModelAndView change(ModelAndView mv){
        mv.setViewName("person/refundManage");
        return mv;
    }

    @RequestMapping(value = "refund",method = RequestMethod.GET)
    public ModelAndView refund(ModelAndView mv){
        mv.setViewName("person/refund");
        return mv;
    }

    @RequestMapping(value = "comment",method = RequestMethod.GET)
    public ModelAndView comment(ModelAndView mv){
        mv.setViewName("person/comment");
        return mv;
    }

    @RequestMapping(value = "commentList",method = RequestMethod.GET)
    public ModelAndView commentList(ModelAndView mv){
        mv.setViewName("person/commentList");
        return mv;
    }
    @RequestMapping(value = "news",method = RequestMethod.GET)
    public ModelAndView news(ModelAndView mv){
        mv.setViewName("person/news");
        return mv;
    }


    @RequestMapping(value = "password",method = RequestMethod.GET)
    public ModelAndView password(ModelAndView mv){
        mv.setViewName("person/password");
        return mv;
    }

    @RequestMapping(value = "setPayPassword",method = RequestMethod.GET)
    public ModelAndView setPayPassword(ModelAndView mv){
        mv.setViewName("person/setPayPassword");
        return mv;
    }

    @RequestMapping(value = "collection",method = RequestMethod.GET)
    public ModelAndView collection(ModelAndView mv){
        mv.setViewName("person/collection");
        return mv;
    }

    @PostMapping(value = "login")
    public String login(String username,String password){
        logger.info("用户登录{ username ："+username +",password:"+password );
        User user = new User();
        user.setNickname(username);
        session.setAttribute("session_user",user);
        return "home/index";
    }

    @PostMapping(value = "register")
    public String login(String username,String password,String repeatPassword){
        logger.info("用户注册{ username ："+username +",password:"+password );
        //提示注册成功页面
        return "home/success";
    }

    @GetMapping(value = "logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
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

    @Autowired
    UserService userService;
}
