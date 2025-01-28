package com.davifariasp.behavioral.memento.problema;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public List<String> items = new ArrayList<>();

    public void addItem(String item){
        items.add(item);
    }

    public void removeItem(String item){
        items.remove(item);
    }

    public void showItems(){
        System.out.println("Total itens: " + items.size());

        items.forEach(System.out::println);
    }
}
