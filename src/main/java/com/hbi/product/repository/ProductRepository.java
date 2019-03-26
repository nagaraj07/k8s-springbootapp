package com.hbi.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hbi.product.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
