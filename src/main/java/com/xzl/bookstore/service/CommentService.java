package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.vo.BookCommentVO;
import com.xzl.bookstore.pojo.vo.UserCommentVO;

import java.util.List;

public interface CommentService {
    List<BookCommentVO> findByBookId();

    List<UserCommentVO> findByUserId(Integer id);

    List<UserCommentVO> findByUserIdWithImage(Integer id);
}
