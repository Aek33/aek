package com.example.aek.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Книга: АйДи, название, издательство, год издания
//Свзязь многие-ко-многим с авторами
//Свзязь многие-ко-многим с книгами с заказами
//А нужен ли вообще в b_year тип long?
@Entity
@Table( name = "book", schema = "test")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    @SequenceGenerator(name = "book_seq", schema = "test",
            sequenceName = "book_seq", allocationSize = 1)
    @Column(name = "book_id")
    private long book_id;
    @Column(name = "book_name")
    private String book_name;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "b_year", length = 4)
    private long b_year;

    @ManyToMany
    @JoinTable( name = "Books_authors",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "author_id"))
    private List<Book_author> book_authors = new ArrayList<>();


    public Book(){
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getB_year() {
        return b_year;
    }

    public void setB_year(long b_year) {
        this.b_year = b_year;
    }

    public List<Book_author> getBook_authors() {
        return book_authors;
    }

    public void setBook_authors(List<Book_author> book_authors) {
        this.book_authors = book_authors;
    }
}
