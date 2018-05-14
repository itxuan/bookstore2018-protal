package com.xzl.bookstore.pojo.vo;


import com.xzl.bookstore.pojo.po.Book;

public class CartVO extends Book {

    private Integer amount;
    private Integer check;
    private Integer userId;
    private Integer bookId;
    private Long cartItemSubTotal;
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Long getCartItemSubTotal() {
        return cartItemSubTotal;
    }

    public void setCartItemSubTotal(Long cartItemSubTotal) {
        this.cartItemSubTotal = cartItemSubTotal;
    }
}
