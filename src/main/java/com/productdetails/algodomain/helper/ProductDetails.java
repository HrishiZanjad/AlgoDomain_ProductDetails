package com.productdetails.algodomain.helper;

import javax.persistence.Id;

public class ProductDetails {
    @Id
    private long productId;
    private String name;
    private String productType;
    private String category;
    private double basePrice;
    private double discount;
    private Charges charges;
    private double finalPrice;
    public ProductDetails(long productId, String name, String productType, String category, double basePrice,
            double discount, Charges charges, double finalPrice) {
        this.productId = productId;
        this.name = name;
        this.productType = productType;
        this.category = category;
        this.basePrice = basePrice;
        this.discount = discount;
        this.charges = charges;
        this.finalPrice = finalPrice;
    }
    public ProductDetails() {
    }
    public long getProductId() {
        return productId;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public Charges getCharges() {
        return charges;
    }
    public void setCharges(Charges charges) {
        this.charges = charges;
    }
    public double getFinalPrice() {
        return finalPrice;
    }
    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
    
}
