package com.davifariasp.structural.flyweight.problema;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<Product> products = new ArrayList<>();

        Product product1 = new Product("Camisa Lisa", "Produto de qualidade", "Roupas", "Image 1", "Vermelha", "P");
        Product product2 = new Product("Camisa Estampada", "Produto de qualidade", "Roupas", "Image 2", "Azul", "M");
        Product product3 = new Product("Camisa Polo", "Produto de qualidade", "Roupas", "Image 3", "Verde", "G");
        products.add(product1);
        products.add(product2);
        products.add(product3);

        for (Product product:products){
            product.showProductInfo();
        }

        //description e category são a mesma coisa para todos os produtos
    }
}
