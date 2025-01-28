package com.davifariasp.behavioral.memento.problema;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Laptop");
        shoppingCart.addItem("Mouse");

        shoppingCart.showItems();

        shoppingCart.removeItem("Mouse");

        shoppingCart.showItems();
    }
}
