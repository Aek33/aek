package com.example.aek.models;

import javax.persistence.*;
//Читатель: АйДи, фамилия, имя, номер телефона, адрес

@Entity
@Table( name = "l_reader", schema = "test")
public class Library_reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private long r_id;
    @Column(name = "r_surname")
    private String r_surname;
    @Column(name = "r_name")
    private String r_name;
    @Column(name = "r_phone_number", length = 11)
    private long r_phone_number;
    @Column(name = "r_address")
    private String r_address;

    public Library_reader(){
    }

    public long getR_id() {
        return r_id;
    }

    public void setR_id(long r_id) {
        this.r_id = r_id;
    }

    public String getR_surname() {
        return r_surname;
    }

    public void setR_surname(String r_surname) {
        this.r_surname = r_surname;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public long getR_phone_number() {
        return r_phone_number;
    }

    public void setR_phone_number(long r_phone_number) {
        this.r_phone_number = r_phone_number;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }
}