package com.xzl.bookstore.pojo.po;

public class CommentTag {
    private Integer id;

    private String tagName;

    private String tagAmount;

    private Integer commentId;

    private Integer bookId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagAmount() {
        return tagAmount;
    }

    public void setTagAmount(String tagAmount) {
        this.tagAmount = tagAmount == null ? null : tagAmount.trim();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}