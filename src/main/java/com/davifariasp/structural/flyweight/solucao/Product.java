package com.davifariasp.structural.flyweight.solucao;

public class Product {
    private ProductType productType;
    private String name;
    private String imageUrl;
    private String color;
    private String size;

    public Product(ProductType productType, String name, String imageUrl, String color, String size) {
        this.productType = productType;
        this.name = name;
        this.imageUrl = imageUrl;
        this.color = color;
        this.size = size;
    }

    public void showProductInfo(){
        System.out.println("Product: " + name);
        System.out.println("Category: " + productType.getCategory());
        System.out.println("Description: " + productType.getDescription());
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Image: " + imageUrl);
    }
}
