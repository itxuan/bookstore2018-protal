package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.config.BaseResult;
import com.xzl.bookstore.pojo.po.Book;
import com.xzl.bookstore.pojo.po.Cart;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.pojo.vo.CartVO;
import com.xzl.bookstore.service.BookService;
import com.xzl.bookstore.service.CartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping(value = "person/cart")
public class CartController {

    private static final Logger logger = LoggerFactory.getLogger(CartController.class);
    @GetMapping(value = "list")
    public String cart(Model model){

        List<CartVO> cartVOList = cartService.listByUserId(getCurrentUserId());
        model.addAttribute("cartList",cartVOList);
        return "person/cart";
    }

    @ResponseBody
    @PostMapping(value = "add")
    public Object addBookToCart(Integer bookId){

        int count = cartService.addBookToCart(getCurrentUserId(), bookId);
        if(count > 0){

            logger.info("用户" + ((User)session.getAttribute("session_user")).getNickname()
                    + "添加编号"+bookId+"的书籍到购物车");
            return new BaseResult(1,"书籍成功添加到购物车");
        }
        return new BaseResult(0,"服务器异常，请稍后再试");
    }

    @ResponseBody
    @PostMapping(value = "delete")
    public Object cartDelete(Integer id){
        Cart cart = cartService.findCartById(id);
        if(cart != null) {
            Integer bookId = cart.getBookId();
            logger.info("{" + ((User) session.getAttribute("session_user")).getNickname()
                    + "移除书籍编号为" + bookId + bookService.findById(bookId).getBookname()
                    + LocalDateTime.now() + "}");
        }
        cartService.removeBookFromCart(getCurrentUserId(),id);
        return new BaseResult(1,"");
    }
    @ResponseBody
    @PostMapping(value = "addAmount")
    public Object addAmount(Integer cartId){
        int count = cartService.updateAmount(cartId,1);
        return new BaseResult(1,"");
    }

    @ResponseBody
    @PostMapping(value = "reduceAmount")
    public Object reduceAmount(Integer cartId){
        int count = cartService.updateAmount(cartId,-1);
        return new BaseResult(1,"");
    }

    private Integer getCurrentUserId(){
        User sessionUser = (User)session.getAttribute("session_user");
        if(sessionUser != null){
            return sessionUser.getId();
        }
        return null;
    }
    @Autowired
    HttpSession session;
    @Autowired
    CartService cartService;
    @Autowired
    BookService bookService;
}
