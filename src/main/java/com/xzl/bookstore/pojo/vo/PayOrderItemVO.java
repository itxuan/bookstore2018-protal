package com.xzl.bookstore.pojo.vo;

import com.xzl.bookstore.pojo.po.Book;

public class PayOrderItemVO extends Book {

    private String orderItemId;
    private Long orderItemPrice;
    private Integer amount;
    private Long orderItemSubTotal;
    private Integer bookId;
    /**
     *  包装
     */
    private String bookPack;
    private String bookPage;

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getOrderItemSubTotal() {
        return orderItemSubTotal;
    }

    public void setOrderItemSubTotal(Long orderItemSubTotal) {
        this.orderItemSubTotal = orderItemSubTotal;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Long getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(Long orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    public String getBookPack() {
        return bookPack;
    }

    public void setBookPack(String bookPack) {
        this.bookPack = bookPack;
    }

    public String getBookPage() {
        return bookPage;
    }

    public void setBookPage(String bookPage) {
        this.bookPage = bookPage;
    }
}
