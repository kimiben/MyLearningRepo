package com.example.demo.api.controller;

import com.example.demo.api.model.WishList;
import com.example.demo.api.repository.WishListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wishes")
public class WishListEndPoint {

    @Autowired
    WishListRepo wishListRepo;

    @GetMapping
    public Iterable<WishList> wishes() {
        return wishListRepo.findAll();
    }

    @RequestMapping("/{id}")
    public Object wishesById(@PathVariable Integer id) {
        return wishListRepo.findById(id);
    }

    @PostMapping
    public Iterable<WishList> addWish(@RequestBody WishList wishList){
        wishListRepo.save(wishList);
        return wishListRepo.findAll();
    }

}
