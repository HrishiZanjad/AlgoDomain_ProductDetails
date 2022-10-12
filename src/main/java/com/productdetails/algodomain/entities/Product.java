package com.productdetails.algodomain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private long productId;
    private String productName;
    private String productType;
    private String productCategory;
    private int productprice;

    public Product(long productId, String productName, String productType, String productCategory, int productprice) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productCategory = productCategory;
        this.productprice = productprice;
    }
    
    public Product() {
    }

    public long getProductId() {
        return productId;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public int getProductprice() {
        return productprice;
    }
    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }
    
}
