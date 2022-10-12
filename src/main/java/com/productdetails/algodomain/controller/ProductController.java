package com.productdetails.algodomain.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productdetails.algodomain.entities.Product;
import com.productdetails.algodomain.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    //build Create Product REST API
    @PostMapping()
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.CREATED);
    }

    //build get all Products REST API
    @GetMapping()
    public List<Product> getAllProducts(){
        return  productService.getAllProducts();
    }

    //build get Product by Id REST API
    @GetMapping("{Id}")
    public ResponseEntity<Product> getProductById(@PathVariable("Id") long Id){
        return new ResponseEntity<Product>(productService.geProductById(Id), HttpStatus.OK);
    }

}
