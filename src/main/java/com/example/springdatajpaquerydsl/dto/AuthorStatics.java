package com.example.springdatajpaquerydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.NoRepositoryBean;

@Getter
@Setter
@AllArgsConstructor
@NoRepositoryBean
public class AuthorStatics {
    private String authorName;
    private Long bookCount;
}
