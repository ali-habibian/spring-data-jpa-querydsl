package com.example.springdatajpaquerydsl.controller;

import com.example.springdatajpaquerydsl.dto.AuthorStatics;
import com.example.springdatajpaquerydsl.entity.Author;
import com.example.springdatajpaquerydsl.entity.Book;
import com.example.springdatajpaquerydsl.service.AuthBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest")
public class AuthBookController {
    private final AuthBookService authBookService;

    @PostMapping
    public List<Author> saveAuthorsWithBook(@RequestBody List<Author> authors) {
        return authBookService.saveAuthorsWithBook(authors);
    }

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authBookService.getAuthors();
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return authBookService.getBooks();
    }

    @GetMapping("/authors/{email}")
    public Optional<Author> findAuthorByEmail(@PathVariable String email) {
        return authBookService.findAuthorByEmail(email);
    }

    @GetMapping("/authorStatics")
    public List<AuthorStatics> getAuthorStatics() {
        return authBookService.getAuthorStatics();
    }

    @GetMapping("/authors/fetchJoin")
    public List<Author> getAuthorsWithFetchJoin() {
        return authBookService.getAuthors();
    }
}
