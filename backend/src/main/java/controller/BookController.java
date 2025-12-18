package com.bookmind.backend.controller;

import com.bookmind.backend.model.Book;
import com.bookmind.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/recommend")
    public List<Book> recommendBooks(
            @RequestParam String genre,
            @RequestParam String mood,
            @RequestParam String language,
            @RequestParam int time) {
        return bookRepository.findRecommendations(genre, mood, language, time);
    }
}
