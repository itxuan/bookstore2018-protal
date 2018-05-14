package com.xzl.bookstore.pojo.po;

public class EBook {
    private Integer id;

    private Integer bookId;

    private String eBookUrl;

    private String image;

    private String content;

    private String downloadAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String geteBookUrl() {
        return eBookUrl;
    }

    public void seteBookUrl(String eBookUrl) {
        this.eBookUrl = eBookUrl == null ? null : eBookUrl.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDownloadAmount() {
        return downloadAmount;
    }

    public void setDownloadAmount(String downloadAmount) {
        this.downloadAmount = downloadAmount == null ? null : downloadAmount.trim();
    }
}