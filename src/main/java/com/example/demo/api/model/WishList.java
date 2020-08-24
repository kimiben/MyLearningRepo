package com.example.demo.api.model;

import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class WishList {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    @Column(name = "wish")
    private String wish;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
