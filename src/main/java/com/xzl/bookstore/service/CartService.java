package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.po.Cart;

import java.util.List;

public interface CartService {

    List<Cart> listByUserId(Integer userId);
    int addBookToCart(Integer userId,Integer bookId);
    int removeBookFromCart(Integer userId,Integer bookId);
    int updateCheckState(Integer userId,Integer[] bookId);

}
