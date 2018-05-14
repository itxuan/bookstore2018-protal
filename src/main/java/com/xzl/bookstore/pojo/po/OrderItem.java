package com.xzl.bookstore.pojo.po;

public class OrderItem {
    private String id;

    private Integer bookId;

    private Integer amount;

    private Long price;

    private Integer orderId;

    private Integer bookParamId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBookParamId() {
        return bookParamId;
    }

    public void setBookParamId(Integer bookParamId) {
        this.bookParamId = bookParamId;
    }
}