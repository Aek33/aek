package com.example.aek.service;

import com.example.aek.models.Book;
import com.example.aek.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    // найти все
    public List<Book> getAllBooks(){
        List<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(bookList::add);
        return bookList;
    }
    // найти по айди
    public Book getBookById(Long book_id) {
        Optional<Book> optionalBook = bookRepository.findById(book_id);
        return optionalBook.orElse(null);
    }
    // сохранить
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
    // удалить по айди
    public void deleteBook(Long book_id){
        bookRepository.deleteById(book_id);
    }
}
