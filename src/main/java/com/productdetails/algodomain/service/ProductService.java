package com.productdetails.algodomain.service;

import java.util.List;

import com.productdetails.algodomain.entities.Product;
import com.productdetails.algodomain.helper.ProductDetails;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product geProductById(long Id);
    Product updateProduct(Product product, long Id);
    void deleteProduct(long Id);
    ProductDetails getProducts(long Id);
}
