package com.xzl.bookstore.pojo.vo;

import java.util.Date;

/**
 *  高级查询的bookQuery
 */
public class BookQueryVO {

    private String bookName;
    private String author;
    private String isbn;
    private Long lowerPrice;
    private Long highPrice;
    private Date startPublishDate;
    private Date endPublishDate;
    private Integer categoryId;
    private Integer discount;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getLowerPrice() {
        return lowerPrice;
    }

    public void setLowerPrice(Long lowerPrice) {
        this.lowerPrice = lowerPrice;
    }

    public Long getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Long highPrice) {
        this.highPrice = highPrice;
    }

    public Date getStartPublishDate() {
        return startPublishDate;
    }

    public void setStartPublishDate(Date startPublishDate) {
        this.startPublishDate = startPublishDate;
    }

    public Date getEndPublishDate() {
        return endPublishDate;
    }

    public void setEndPublishDate(Date endPublishDate) {
        this.endPublishDate = endPublishDate;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
