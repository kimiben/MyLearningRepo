package com.example.demo.api.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WishList {
    @Id
    @Column(name = "id")
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
