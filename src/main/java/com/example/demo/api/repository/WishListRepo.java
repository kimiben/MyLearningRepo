package com.example.demo.api.repository;

import com.example.demo.api.model.WishList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepo  extends CrudRepository<WishList, Integer> {

}
