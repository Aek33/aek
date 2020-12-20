package com.example.aek.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Автор: АйДи, фамилия, имя
//Свзязь многие-ко-многим с книгами
@Entity
@Table( name = "b_author", schema = "test")
public class Book_author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "b_author_seq")
    @SequenceGenerator(name = "b_author_seq", schema = "test",
            sequenceName = "b_author_seq", allocationSize = 1)
    @Column(name = "author_id")
    private long author_id;
    @Column(name = "a_surname", length = 30)
    private String a_surname;
    @Column(name = "a_name", length = 30)
    private String a_name;

    @ManyToMany (mappedBy = "book_authors")
    private List<Book> books = new ArrayList<>();

    public Book_author(){
    }

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }

    public String getA_surname() {
        return a_surname;
    }

    public void setA_surname(String a_surname) {
        this.a_surname = a_surname;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }
}
