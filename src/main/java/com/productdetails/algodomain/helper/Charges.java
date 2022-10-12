package com.productdetails.algodomain.helper;

public class Charges {
    private double gst;
    private double delivery;
    public Charges() {
    }
    public Charges(double gst, double delivery) {
        this.gst = gst;
        this.delivery = delivery;
    }
    public double getGst() {
        return gst;
    }
    public void setGst(double gst) {
        this.gst = gst;
    }
    public double getDelivery() {
        return delivery;
    }
    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }    
}
