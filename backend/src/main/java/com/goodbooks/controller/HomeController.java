package com.goodbooks.controller;

import java.util.List;

import com.goodbooks.model.Book;
import com.goodbooks.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public List<Book> gBooks() {
        return bookRepository.findAll();
    }

}
