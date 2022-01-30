package com.example.springdatajpaquerydsl.service;

import com.example.springdatajpaquerydsl.dto.AuthorStatics;
import com.example.springdatajpaquerydsl.entity.Author;
import com.example.springdatajpaquerydsl.entity.Book;
import com.example.springdatajpaquerydsl.repository.AuthorRepository;
import com.example.springdatajpaquerydsl.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthBookService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public List<Author> saveAuthorsWithBook(List<Author> authors) {
        return authorRepository.saveAll(authors);
    }

    // Will find N+1 problem in hibernate/jpa
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Optional<Author> findAuthorByEmail(String email) {
        return authorRepository.findAuthorByEmail(email);
    }

    public List<AuthorStatics> getAuthorStatics() {
        return authorRepository.getAuthorStatics();
    }

    // To avoid N+1 problem in hibernate/jpa
    public List<Author> getAuthorsWithFetchJoin() {
        return authorRepository.getAuthors();
    }
}
