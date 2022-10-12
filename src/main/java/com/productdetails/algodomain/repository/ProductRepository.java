package com.productdetails.algodomain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productdetails.algodomain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
