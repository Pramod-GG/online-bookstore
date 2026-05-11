package com.bookstore.service;

import com.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private List<Book> books = List.of(

    new Book(
        1,
        "Java Basics",
        "John",
        299,
        "Learn Java from scratch"
    ),

    new Book(
        2,
        "Spring Boot Guide",
        "Alice",
        499,
        "Complete Spring Boot concepts"
    ),

    new Book(
        3,
        "Data Structures",
        "Bob",
        399,
        "Master DSA concepts"
    ),

    new Book(
        4,
        "Machine Learning",
        "Andrew",
        699,
        "Learn ML concepts"
    ),

    new Book(
        5,
        "Web Development",
        "David",
        599,
        "Frontend and backend guide"
    ),

    new Book(
        6,
        "Database Systems",
        "Kevin",
        549,
        "Understand SQL and databases"
    )

);
    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int id) {

        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }
}