package com.davifariasp.structural.flyweight.solucao;

public class ProductType {
    private String description;
    private String category;

    public ProductType(String description, String category) {
        this.description = description;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}
