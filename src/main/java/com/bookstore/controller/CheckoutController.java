package com.bookstore.controller;

import com.bookstore.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkout")
@CrossOrigin
public class CheckoutController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public String checkout() {

        cartService.clearCart();

        return "Order placed successfully!";
    }
}