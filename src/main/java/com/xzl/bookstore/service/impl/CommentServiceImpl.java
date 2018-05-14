package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.CommentMapper;
import com.xzl.bookstore.pojo.po.Comment;
import com.xzl.bookstore.pojo.vo.BookCommentVO;
import com.xzl.bookstore.pojo.vo.UserCommentVO;
import com.xzl.bookstore.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CommentServiceImpl implements CommentService {

    @Override
    public List<BookCommentVO> findByBookId() {
        return null;
    }

    @Override
    public List<UserCommentVO> findByUserId(Integer id) {
        return null;
    }

    @Override
    public List<UserCommentVO> findByUserIdWithImage(Integer id) {
        return null;
    }
    @Autowired
    CommentMapper commentMapper;
}
