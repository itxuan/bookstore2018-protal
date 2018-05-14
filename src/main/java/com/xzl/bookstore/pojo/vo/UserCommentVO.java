package com.xzl.bookstore.pojo.vo;

import com.xzl.bookstore.pojo.po.Comment;

public class UserCommentVO  extends Comment {

    private Integer commentId;
    private String bookIcon;
    private String bookname;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getBookIcon() {
        return bookIcon;
    }

    public void setBookIcon(String bookIcon) {
        this.bookIcon = bookIcon;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
