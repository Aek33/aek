package com.example.aek.controller;

import com.example.aek.models.Book;
import com.example.aek.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Важно! RequestMapping(value = "/something") значит localhost:8080/something
//spring.jpa.hibernate.ddl-auto=create снесет и заменит на новыую update обновит существующую
@RestController
public class LibraryController {

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/start")
    public String itWorks(){
        return "Контроллер работает";
    }

    private final BookService bookService;

    @RequestMapping(value = "/search/{id}", method = RequestMethod.GET)
    public Book getBookByID(@PathVariable Long id){
        return bookService.getBookById(id);
    }

}