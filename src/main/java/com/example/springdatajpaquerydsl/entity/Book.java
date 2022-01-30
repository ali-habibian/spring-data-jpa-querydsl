package com.example.springdatajpaquerydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Book {
    @Id
    private int bookId;
    private String name;
    private String isbn;
}
