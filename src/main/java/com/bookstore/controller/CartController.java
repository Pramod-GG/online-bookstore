package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import com.bookstore.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private BookService bookService;

    @PostMapping("/{id}")
    public String addToCart(@PathVariable int id) {

        Book book = bookService.getBookById(id);

        if (book != null) {
            cartService.addToCart(book);
            return "Book added to cart";
        }

        return "Book not found";
    }

    @GetMapping
    public List<Book> getCart() {
        return cartService.getCart();
    }

    @DeleteMapping("/{id}")
    public String removeFromCart(@PathVariable int id) {

        cartService.removeFromCart(id);

        return "Book removed from cart";
    }
}