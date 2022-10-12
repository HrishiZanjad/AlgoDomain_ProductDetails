package com.productdetails.algodomain.service;

import java.util.List;

import com.productdetails.algodomain.entities.Product;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product geProductById(long Id);
}
