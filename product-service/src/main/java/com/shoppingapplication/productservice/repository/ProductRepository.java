package com.shoppingapplication.productservice.repository;

import com.shoppingapplication.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
