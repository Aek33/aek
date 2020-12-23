package com.example.aek.controller;

import com.example.aek.models.Book;
import com.example.aek.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//RequestMapping(value = "/something") значит localhost:8080/something
//spring.jpa.hibernate.ddl-auto=create снесет и заменит на новыую update обновит существующую
//Postgres не работает с Opera
@RestController
public class BookController {

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/BookStart")
    public String itWorks(){
        return "Контроллер работает";
    }
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public Book getBookByID(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @RequestMapping(value = "/books/save", method = RequestMethod.POST)
    public void saveBook(Book book){
        bookService.saveBook(book);
    }

    @RequestMapping(value = "/books/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable Long id){
       bookService.deleteBook(id);
    }
}