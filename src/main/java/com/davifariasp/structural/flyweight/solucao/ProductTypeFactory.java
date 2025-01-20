package com.davifariasp.structural.flyweight.solucao;

import java.util.HashMap;
import java.util.Map;

public class ProductTypeFactory {
    private final Map<String, ProductType> productTypes = new HashMap<>();

    public ProductType getProductType(String category, String description){

        String key = category + "_" + description;

        if (!productTypes.containsKey(key)){
            productTypes.put(key, new ProductType(description, category));
        }

        return productTypes.get(key);
    }
}
