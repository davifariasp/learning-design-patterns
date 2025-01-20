package com.davifariasp.structural.flyweight.solucao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        ProductTypeFactory productTypeFactory = new ProductTypeFactory();

        ProductType commomType = productTypeFactory.getProductType("Roupas", "Produto de qualidade");

        List<Product> products = new ArrayList<>();

        products.add(new Product(commomType, "Camisa lisa", "Image 1", "Vermelha", "P"));
        products.add(new Product(commomType, "Camisa estampada", "Image 2", "Azul", "M"));
        products.add(new Product(commomType, "Camisa polo", "Image 3", "Verde", "G"));

        for (Product product:products){
            product.showProductInfo();
        }
    }
}
