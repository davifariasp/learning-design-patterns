package com.davifariasp.structural.flyweight.problema;

public class Product {
    private String name;
    private String description;
    private String category;
    private String imageUrl;
    private String color;
    private String size;

    public Product(String name, String description, String category, String imageUrl, String color, String size) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.imageUrl = imageUrl;
        this.color = color;
        this.size = size;
    }

    public void showProductInfo(){
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.println("Categoria: " + category);
        System.out.println("Imagem: " + imageUrl);
        System.out.println("Cor: " + color);
        System.out.println("Tamanho: " + size);
    }
}
