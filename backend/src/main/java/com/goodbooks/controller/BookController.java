package com.goodbooks.controller;

import java.util.List;

import com.goodbooks.model.Book;
import com.goodbooks.model.BookRating;
import com.goodbooks.repository.BookRatingRepository;
import com.goodbooks.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookRatingRepository bookRatingRepository;

    @GetMapping("/")
    public List<Book> gBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/topTen")
    public List<BookRating> topTen() {
        Pageable sortedByRatingDesc =  PageRequest.of(0, 10, Sort.by("rating").descending());
        return bookRatingRepository.findAll(sortedByRatingDesc).toList();
    }


    //@GetMapping("/{id}")
    //public Book getUser(@PathVariable Integer id) {
    //    return userRepository.findById(id).orElse(null);
    //}

    //@PostMapping("/")
    //public Book postUser(@RequestBody Book user) {
    //    return userRepository.save(user);
    //}

    //@PutMapping("/")
    //public Book putUser(@RequestBody Book user) {
    //    Book oldUser = userRepository.findById(user.getId()).orElse(null);
    //    oldUser.setTitle(user.getTitle());
    //    oldUser.setSubtitle(user.getName());
    //    oldUser.setPassword(user.getPassword());
        
    //    return userRepository.save(oldUser);
    //}

    //@DeleteMapping("/{id}")
    //public Integer deleteUser(@PathVariable Integer id) {
    //    userRepository.deleteById(id);
    //    return id;
    //}
}
