package com.xzl.bookstore.pojo.po;

public class Cart {
    private Integer id;

    private Integer userId;

    private Integer bookId;

    private Integer amount;

    private Integer isCheck;

    private Long cartItemSubtotal;

    private Long currentPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Long getCartItemSubtotal() {
        return cartItemSubtotal;
    }

    public void setCartItemSubtotal(Long cartItemSubtotal) {
        this.cartItemSubtotal = cartItemSubtotal;
    }

    public Long getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
    }
}