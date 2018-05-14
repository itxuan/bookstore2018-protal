package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.pojo.vo.UserCommentVO;
import com.xzl.bookstore.service.CommentService;
import com.xzl.bookstore.service.UserService;
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
import java.util.Date;
import java.util.List;

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

//    @RequestMapping(value = "comment",method = RequestMethod.GET)
//    public ModelAndView comment(ModelAndView mv){
//        mv.setViewName("person/comment");
//        return mv;
//    }

//    @RequestMapping(value = "commentList",method = RequestMethod.GET)
//    public ModelAndView commentList(ModelAndView mv){
//        mv.setViewName("person/commentList");
//        return mv;
//    }
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

    @GetMapping(value = "logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/home/login";
    }

    /**
     *  查询自己的评论
     * @return
     */
    @GetMapping(value = "comment/ist")
    public String l(Model model) {
        List<UserCommentVO> commentVOList =  commentService.findByUserId(getCurrentUser().getId());
        List<UserCommentVO> imageCommentVOList =  commentService.findByUserIdWithImage(getCurrentUser().getId());
        model.addAttribute("commentVOList",commentVOList);
        model.addAttribute("imageCommentVOList",imageCommentVOList);
        return "person/comment";
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
    @Autowired
    CommentService commentService;
}
