package com.example.springdatajpaquerydsl.repository.impl;

import com.example.springdatajpaquerydsl.entity.Book;
import com.example.springdatajpaquerydsl.repository.BookRepository;

import javax.persistence.EntityManager;

public class BookRepositoryImpl extends BaseRepositoryImpl<Book, Integer> implements BookRepository {

    public BookRepositoryImpl(EntityManager em) {
        super(Book.class, em);
    }
}
