package com.zzo.ecomm.services;

import org.springframework.stereotype.Service;

import com.zzo.ecomm.entities.Products;
import com.zzo.ecomm.repositories.ProductsRepository;

@Service
public class ProductService {

    private final ProductsRepository productsRepository;
    private final SequenceGeneratorService sequenceGenerator;

    public ProductService(ProductsRepository productsRepository, SequenceGeneratorService sequenceGenerator) {
        this.productsRepository = productsRepository;
        this.sequenceGenerator = sequenceGenerator;
    }

    public Products addProduct(Products products) {
        products.setProductId(sequenceGenerator.getNextSequence("products_seq"));
        return productsRepository.save(products);
    }
    
}

