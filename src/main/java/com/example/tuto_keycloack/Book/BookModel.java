package com.example.tuto_keycloack.Book;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Book")
@Data
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
