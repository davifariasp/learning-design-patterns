package com.davifariasp.behavioral.memento.solucao;

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

    public Memento saveState(){
        return new Memento(items);
    }

    public void restoreState(Memento memento){
        items = memento.getState();
    }
}
