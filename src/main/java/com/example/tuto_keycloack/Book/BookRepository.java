package com.example.tuto_keycloack.Book;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookModel, Long> {
}
