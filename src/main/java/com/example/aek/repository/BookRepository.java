package com.example.aek.repository;

import com.example.aek.models.Book;
import org.springframework.data.repository.CrudRepository;

//Класс Book уже существует
public interface BookRepository extends CrudRepository<Book, Long> {
}
