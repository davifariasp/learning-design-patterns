package com.davifariasp.behavioral.mediator.problema;

public class Ecomerce {
    public static void finalizePurchase(){
        PayamentSystem.processPayament();
        StockSystem.reduceStock();
        ShippingSystem.shipProduct();
    }
}
