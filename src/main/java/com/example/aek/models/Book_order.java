package com.example.aek.models;

import javax.persistence.*;
import java.util.Date;
//Заказ книги: номер выдачи, дата выдачи, срок, АйДи читателя, АйДи книги
@Entity
@Table(name = "order", schema = "test")
public class Book_order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Book_order_seq")
    @SequenceGenerator(name = "Book_order_seq", schema = "test",
            sequenceName = "Book_order_seq", allocationSize = 1)
    @Column(name = "Book_order_number")
    private long Book_order_number;
    @Column(name = "date_of_issue")
    private Date date_of_issue;
    @Column(name = "limitation")
    private Long limitation;

    public Book_order(){
    }

    public long getBook_order_number() {
        return Book_order_number;
    }

    public void setBook_order_number(long book_order_number) {
        Book_order_number = book_order_number;
    }

    public Date getDate_of_issue() {
        return date_of_issue;
    }

    public void setDate_of_issue(Date date_of_issue) {
        this.date_of_issue = date_of_issue;
    }

    public Long getLimitation() {
        return limitation;
    }

    public void setLimitation(Long limitation) {
        this.limitation = limitation;
    }
}
