package com.example.springdatajpaquerydsl.repository;

import com.example.springdatajpaquerydsl.dto.AuthorStatics;
import com.example.springdatajpaquerydsl.entity.Author;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends BaseRepository<Author, Integer> {

    Optional<Author> findAuthorByEmail(String email);

    List<AuthorStatics> getAuthorStatics();

    List<Author> getAuthors();
}
