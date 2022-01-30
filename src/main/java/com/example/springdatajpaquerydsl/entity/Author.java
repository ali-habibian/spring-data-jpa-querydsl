package com.example.springdatajpaquerydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue
    private int authorId;
    private String name;
    private String email;

    @OneToMany(targetEntity = Book.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", referencedColumnName = "authorId")
    private List<Book> books;
}
