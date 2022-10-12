package com.productdetails.algodomain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.productdetails.algodomain.entities.Product;
import com.productdetails.algodomain.exception.ResourceNotFound;
import com.productdetails.algodomain.helper.Charges;
import com.productdetails.algodomain.helper.ProductDetails;
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

    @Override
    public Product updateProduct(Product product, long Id) {
        Product existingProduct=productRepository.findById(Id).orElseThrow(() -> new ResourceNotFound("Product", "Id", Id));
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductType(product.getProductType());
        existingProduct.setProductCategory(product.getProductCategory());
        productRepository.save(existingProduct);
        return existingProduct;
    }

    @Override
    public void deleteProduct(long Id) {

        productRepository.findById(Id).orElseThrow(() -> new ResourceNotFound("Product", "Id", Id));

        productRepository.deleteById(Id);        
    }

    @Override
    public ProductDetails getProducts(long Id) {
        Product product=productRepository.findById(Id).orElseThrow(() -> new ResourceNotFound("Product", "Id", Id));
        ProductDetails productDetails=new ProductDetails();
        productDetails.setProductId(product.getProductId());
        productDetails.setName(product.getProductName());
        productDetails.setProductType(product.getProductType());
        productDetails.setCategory(product.getProductCategory());
        productDetails.setBasePrice(product.getProductPrice());
        if(product.getProductCategory()=="Electronics"){
            productDetails.setDiscount(productDetails.getBasePrice()*0.15);
            productDetails.setCharges(new Charges(productDetails.getBasePrice()*0.18,350));
        }else if(product.getProductCategory()=="Home Appliance"){
            productDetails.setDiscount(productDetails.getBasePrice()*0.22);
            productDetails.setCharges(new Charges(productDetails.getBasePrice()*0.24,800));
        }else if(product.getProductCategory()=="Clothing"){
            productDetails.setDiscount(productDetails.getBasePrice()*0.44);
            productDetails.setCharges(new Charges(productDetails.getBasePrice()*0.12,0));
        }else{
            productDetails.setDiscount(productDetails.getBasePrice()*0.10);
            productDetails.setCharges(new Charges(productDetails.getBasePrice()*0.18,300));
        }
        productDetails.setFinalPrice(productDetails.getBasePrice()+productDetails.getCharges().getGst()-productDetails.getDiscount()-productDetails.getDiscount());
        return productDetails;
    }
    
}
