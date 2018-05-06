package com.xzl.bookstore.controller.home.person;

import com.xzl.bookstore.pojo.po.Cart;
import com.xzl.bookstore.pojo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "person/cart")
public class CartController {

    @GetMapping(value = "list")
    public String cart(Model model){
        Cart cart = new Cart();

        model.addAttribute("cartList",cart);
        return "home/cart";
    }

    @ResponseBody
    @PostMapping(value = "delete")
    public Object cartDelete(Integer id){
        Integer userId = getCurrentUser().getId();

        return "home/cart";
    }

    private User getCurrentUser(){
        User sessionUser = (User)session.getAttribute("session_user");
        if(sessionUser == null){
            return null;
        }
        return sessionUser;
    }
    @Autowired
    HttpSession session;
}
