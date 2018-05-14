package com.xzl.bookstore.controller.home;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzl.bookstore.config.BaseResult;
import com.xzl.bookstore.config.WebConfig;
import com.xzl.bookstore.pojo.po.*;
import com.xzl.bookstore.service.AdvertService;
import com.xzl.bookstore.service.BookService;
import com.xzl.bookstore.service.UserService;
import com.xzl.bookstore.util.MyUtil;
import com.xzl.bookstore.util.Result;
import com.xzl.bookstore.util.TimeConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.*;

@RequestMapping("home")
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String toIndex(Model model){

        /**
         *  轮播图信息
         */
        List<Advert> advertList = advertService.findAll();
        model.addAttribute("advertList",advertList);

        /**
         *  少儿
         */
        List<Integer> childList =  new ArrayList<>();
        childList.add(19);
        childList.add(20);
        childList.add(21);
        childList.add(22);
        PageHelper.startPage(1,8);
        List<Book> childBookList = bookService.selectBookByCategory(childList);
        PageInfo<Book> childPageInfo = new PageInfo<>(childBookList);
        model.addAttribute("childPageInfo",childPageInfo);
        /**
         *  文学
         */
        List<Integer> wenXueList =  new ArrayList<>();
        wenXueList.add(23);
        wenXueList.add(24);
        wenXueList.add(25);
        PageHelper.startPage(1,8);
        List<Book> wenXueBookList = bookService.selectBookByCategory(wenXueList);
        PageInfo<Book> wenXuePageInfo = new PageInfo<>(wenXueBookList);
        model.addAttribute("wenXuePageInfo",wenXuePageInfo);
        /**
         *  新书上架1
         */

        /**
         *  独家特供
         */
        /**
         *  主编推荐2
         */

        return "home/index";
    }

    @RequestMapping(value = "detail",method = RequestMethod.GET)
    public String bookDetail(Integer id, Model model){
        Book book= bookService.findById(id);
        BookCategory category = bookService.findBookCategoryByBookId(book.getCategoryId());
        BookParam bookParam = bookService.findBookParamByBookId(book.getId());
        EBook eBook = bookService.findEBookByBookId(book.getId());
        model.addAttribute("bookCategory",category);
        model.addAttribute("book",book);
        model.addAttribute("bookParam",bookParam);
        model.addAttribute("eBook",eBook);
        return "home/detail";
    }

    @GetMapping(value = "search")
    public String toSearch(){

        return "home/search";
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String userLoginPage(){
        return "home/login";
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String toRegister(){
        return "home/register";
    }

    @GetMapping(value = "registerSuccess")
    public String toRegisterSuccess(){
        return "home/success";
    }

    @ResponseBody
    @PostMapping(value = "login")
    public Object login(String nickName,String password){
        User user = new User();
        user.setNickname(nickName);
        user.setPassword(MyUtil.MD5(password));
        User dbUser = userService.login(user);
        if(dbUser == null){

            logger.info("用户登录{ username ："+nickName +",password:"+password+"} user不存在" );
            return new BaseResult(0,WebConfig.MESSAGE_ERROR);
        }else {
            String isLock = dbUser.getIsLock();
            if("0".equals(isLock)){
                logger.info("用户登录{ username ："+nickName +",password:"+password+"} user 锁定" );
                return new BaseResult(0,WebConfig.MESSAGE_5);
            }else {
                logger.info("用户登录{ username ："+nickName +",password:"+password+"} user login" + LocalDateTime.now());
                dbUser.setUpdateTime(new Date());
                dbUser.setIp(MyUtil.getClientIp(request));
                userService.update(dbUser);

                dbUser.setPassword(null);
                session.setAttribute("session_user",dbUser);
                return new BaseResult(1,WebConfig.MESSAGE_1,dbUser.getIp());
            }
        }
    }
    @ResponseBody
    @PostMapping(value = "register")
    public Object register(String nickName,String password){
        logger.info("用户注册{ nickName ："+nickName +",password:"+password );
        //提示注册成功页
        User user = new User();
        user.setPassword(MyUtil.MD5(password));
        user.setNickname(nickName);
        user.setCreateTime(new Date());
        user.setIsLock("1");
        user.setGender((byte)0);
        int count = userService.register(user);
        if(count > 0){
            return new BaseResult(1,WebConfig.MESSAGE_1);
        }
        return new BaseResult(0,"");
    }


    @ResponseBody
    @PostMapping(value = "register/ajax")
    public Object registerAjax(String nickName,String password,String rePassword){
        Map<String,Object> map = new HashMap<>();
        boolean flag = userService.registerAjax(nickName);
        map.put("success",flag);
        return map;
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class, new TimeConvertUtil());
    }

    @Autowired
    HttpServletRequest request;
    @Autowired
    HttpSession session;

    @Autowired
    AdvertService advertService;
    @Autowired
    BookService bookService;
    @Autowired
    UserService userService;
}
