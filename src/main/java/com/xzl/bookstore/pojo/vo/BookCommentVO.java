package com.xzl.bookstore.pojo.vo;

import com.xzl.bookstore.pojo.po.Comment;

public class BookCommentVO extends Comment {

    private Integer commentId;
    private String nickName;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
