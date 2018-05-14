package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.BookMapper;
import com.xzl.bookstore.dao.CartMapper;
import com.xzl.bookstore.pojo.po.Book;
import com.xzl.bookstore.pojo.po.Cart;
import com.xzl.bookstore.pojo.po.CartExample;
import com.xzl.bookstore.pojo.vo.CartVO;
import com.xzl.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class CartServiceImpl implements CartService {

    @Override
    public List<CartVO> listByUserId(Integer userId) {

        List<CartVO> cartVOList = new ArrayList<>();
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        /**
         *  数据库中的cartList
         */
        List<Cart> carts = cartMapper.selectByExample(cartExample);

        if(carts != null && carts.size()== 0){
            return cartVOList;
        }
        for(int i = 0; carts!= null && i< carts.size(); i++){
            //每一个购物车项
            Cart cartItem = carts.get(i);
            Book book = bookMapper.selectByPrimaryKey(cartItem.getBookId());
            CartVO cartVO = new CartVO();
            cartVO.setUserId(userId);
            cartVO.setAmount(cartItem.getAmount());
            cartVO.setCheck(cartItem.getIsCheck());
//            cartVO.setCartItemSubTotal(book.getCurrentPrice() * cartItem.getAmount());
            cartVO.setId(cartItem.getId());
            cartVO.setBookId(book.getId());
            cartVO.setBookname(book.getBookname());
            cartVO.setBookIcon(book.getBookIcon());
            cartVO.setCurrentPrice(book.getCurrentPrice());
            cartVOList.add(cartVO);
        }
        return cartVOList;
    }

    @Override
    public int addBookToCart(Integer userId, Integer bookId) {

        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        CartExample.Criteria criteria1 = criteria.andUserIdEqualTo(userId).andBookIdEqualTo(bookId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        int count = 0;
        if(carts != null && carts.size()> 0){
            //购物车中存在这本书
            Cart dbCart = carts.get(0);
            dbCart.setAmount(dbCart.getAmount()+1);
            count += cartMapper.updateByPrimaryKeySelective(dbCart);
        }else {
            //购物车不存在这本书
            Cart cart = new Cart();
            cart.setUserId(userId);
            cart.setBookId(bookId);
            cart.setAmount(1);
            count += cartMapper.insertSelective(cart);
        }
        return count;
    }

    @Override
    public int removeBookFromCart(Integer userId, Integer bookId) {
        int count = cartMapper.deleteByPrimaryKey(bookId);
        return count;
    }

    @Override
    public int updateCheckState(Integer userId, Integer[] bookId) {
        return 0;
    }

    @Override
    public int updateAmount(Integer cartId,Integer amount) {
        Cart cart = cartMapper.selectByPrimaryKey(cartId);
        cart.setAmount(cart.getAmount()+ amount);

        int count = cartMapper.updateByPrimaryKeySelective(cart);
        return count;
    }

    @Override
    public Cart findCartById(Integer cartId) {
        return cartMapper.selectByPrimaryKey(cartId);
    }

    @Autowired
    CartMapper cartMapper;

    @Autowired
    BookMapper bookMapper;
}
