package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.po.Cart;
import com.xzl.bookstore.pojo.vo.CartVO;

import java.util.List;

public interface CartService {

    List<CartVO> listByUserId(Integer userId);
    int addBookToCart(Integer userId,Integer bookId);
    int removeBookFromCart(Integer userId,Integer bookId);
    int updateCheckState(Integer userId,Integer[] bookId);
    int updateAmount(Integer bookId,Integer amount);

    Cart findCartById(Integer cartId);
}
