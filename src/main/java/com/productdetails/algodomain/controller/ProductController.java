package com.productdetails.algodomain.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productdetails.algodomain.entities.Product;
import com.productdetails.algodomain.helper.ProductDetails;
import com.productdetails.algodomain.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    //build Create Product REST API
    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.CREATED);
    }

    //build get all Products REST API
    @GetMapping("/get")
    public List<Product> getAllProducts(){
        return  productService.getAllProducts();
    }

    //build get Product by Id REST API
    @GetMapping("/getById/{Id}")
    public ResponseEntity<Product> getProductById(@PathVariable("Id") long Id){
        return new ResponseEntity<Product>(productService.geProductById(Id), HttpStatus.OK);
    }

    //Build Update Product by Id REST API
    @PutMapping("/update/{Id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long Id, @RequestBody Product product){
        return new ResponseEntity<Product>(productService.updateProduct(product, Id), HttpStatus.OK);
    }

    //Build Delete by Id Product REST API
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("Id") long Id){
        productService.deleteProduct(Id);
        return new ResponseEntity<String>("Product Deleted Successfully!",HttpStatus.OK );
    }

    //Get Products Method
    @GetMapping("/getProducts/{Id}")
    public ResponseEntity<ProductDetails> getProducts(@PathVariable("Id") long Id){
        return new ResponseEntity<ProductDetails>(productService.getProducts(Id),HttpStatus.OK);
    }

}
