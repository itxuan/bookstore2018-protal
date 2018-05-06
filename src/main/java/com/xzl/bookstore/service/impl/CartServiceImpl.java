package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.pojo.po.Cart;
import com.xzl.bookstore.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public List<Cart> listByUserId(Integer userId) {
        return null;
    }

    @Override
    public int addBookToCart(Integer userId, Integer bookId) {
        return 0;
    }

    @Override
    public int removeBookFromCart(Integer userId, Integer bookId) {
        return 0;
    }

    @Override
    public int updateCheckState(Integer userId, Integer[] bookId) {
        return 0;
    }
}
