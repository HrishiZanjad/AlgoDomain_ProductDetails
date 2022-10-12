package com.productdetails.algodomain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.productdetails.algodomain.entities.Product;
import com.productdetails.algodomain.exception.ResourceNotFound;
import com.productdetails.algodomain.repository.ProductRepository;
import com.productdetails.algodomain.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }

    @Override
    public Product geProductById(long Id) {
        return productRepository.findById(Id).orElseThrow(() -> new ResourceNotFound("Product", "Id", Id));
    }
    
}
