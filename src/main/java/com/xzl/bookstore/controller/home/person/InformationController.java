package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.config.WebConfig;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.service.UserService;
import com.xzl.bookstore.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;


@Controller
@RequestMapping("person")
public class InformationController {

    private static final Logger logger = LoggerFactory.getLogger(InformationController.class);

    @RequestMapping(value = "information/list",method = RequestMethod.GET)
    public ModelAndView information(ModelAndView mv){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        User user = userService.getUserById( getCurrentUserId());
        Date birthday = user.getBirthday();
        Date createTime = user.getCreateTime();
        if(birthday != null){
            String format = sdf.format(birthday);
            mv.addObject("birthday",format);
        }else {
            String format = sdf.format(createTime);
            mv.addObject("birthday",format);
        }
        mv.addObject("user",user);

        mv.setViewName("person/information");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "information/update",method = RequestMethod.POST)
    public Result update(User user, MultipartFile user_icon)throws IOException {
        if(user_icon != null && !user_icon.isEmpty()){
            String s = FileUploadUtil.generateFileName(user_icon);
            logger.info("save icon to oss："+ s);
            FileUploadUtil.uploadImageByOSS(s,user_icon.getInputStream());
            user.setIcon(WebConfig.OSS_IMAGE_URL+s);
        }
        System.out.println("update method=====>"+user.toString());
        Result result = userService.update(user);
        return result;
    }

    @RequestMapping(value = "information/password",method = RequestMethod.GET)
    public ModelAndView password(ModelAndView mv){
        mv.setViewName("person/password");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "password/update",method = RequestMethod.POST)
    public Result updatePassword(String oldPassword, String newPassword, HttpSession session){
        User user = userService.getUserById(getCurrentUserId());

        String password = user.getPassword();
        if(password.equals(MyUtil.MD5(oldPassword))){
            //与原密码相同
            logger.info(user.getNickname()+" 更改密码操作 oldPassword=====> "
                    +oldPassword +",newPassword===>"+newPassword + "修改时间:"+LocalDateTime.now());
            user.setPassword(MyUtil.MD5(newPassword));
            Result update = userService.update(user);
            return update;
        }else {
            return new Result("",false,"旧密码错误");
        }
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
    UserService userService;

}
