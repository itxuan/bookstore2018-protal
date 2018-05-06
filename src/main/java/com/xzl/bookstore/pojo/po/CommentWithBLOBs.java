package com.xzl.bookstore.pojo.po;

public class CommentWithBLOBs extends Comment {
    private String content;

    private String image;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}