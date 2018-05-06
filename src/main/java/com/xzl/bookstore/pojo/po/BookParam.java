package com.xzl.bookstore.pojo.po;

public class BookParam {
    private Integer id;

    private Integer bookId;

    private String catalog;

    private String chapter1;

    private String chapter2;

    private String chapter3;

    private String page;

    private String size;

    private String isbn;

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

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getChapter1() {
        return chapter1;
    }

    public void setChapter1(String chapter1) {
        this.chapter1 = chapter1 == null ? null : chapter1.trim();
    }

    public String getChapter2() {
        return chapter2;
    }

    public void setChapter2(String chapter2) {
        this.chapter2 = chapter2 == null ? null : chapter2.trim();
    }

    public String getChapter3() {
        return chapter3;
    }

    public void setChapter3(String chapter3) {
        this.chapter3 = chapter3 == null ? null : chapter3.trim();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }
}