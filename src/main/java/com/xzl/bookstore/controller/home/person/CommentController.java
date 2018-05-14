package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.config.BaseResult;
import com.xzl.bookstore.pojo.po.Comment;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.pojo.vo.BookCommentVO;
import com.xzl.bookstore.pojo.vo.UserCommentVO;
import com.xzl.bookstore.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "home")
public class CommentController {

    @PostMapping(value = "add")
    @ResponseBody
    public Object addComment(Comment comment){


        return new BaseResult(1,"评论成功");
    }

    @GetMapping(value = "findByBookId")
    public List<BookCommentVO> findByBookId(Integer bookId){
        List<BookCommentVO> bookCommentVOList = commentService.findByBookId();
        return null;
    }




    @Autowired
    CommentService commentService;
    @Autowired
    HttpSession session;
}
