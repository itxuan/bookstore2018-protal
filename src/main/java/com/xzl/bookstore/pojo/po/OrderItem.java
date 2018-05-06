package com.xzl.bookstore.pojo.po;

public class OrderItem {
    private Integer id;

    private Integer bookId;

    private Integer amount;

    private Long price;

    private Long total;

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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", amount=" + amount +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}