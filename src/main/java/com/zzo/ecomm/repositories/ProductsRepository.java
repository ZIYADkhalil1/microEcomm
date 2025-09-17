package com.zzo.ecomm.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zzo.ecomm.entities.Products;

public interface ProductsRepository extends MongoRepository<Products, String> {

}
