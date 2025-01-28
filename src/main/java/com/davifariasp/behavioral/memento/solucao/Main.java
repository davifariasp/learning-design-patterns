package com.davifariasp.behavioral.memento.solucao;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        Caretaker caretaker = new Caretaker();

        shoppingCart.addItem("Laptop");
        shoppingCart.addItem("Mouse");

        shoppingCart.showItems();

        // Salvar o estado atual do carrinho
        caretaker.addMemento(shoppingCart.saveState());

        shoppingCart.removeItem("Mouse");

        shoppingCart.showItems();

        // Restaurar o estado anterior do carrinho
        shoppingCart.restoreState(caretaker.getMemento(0));

        shoppingCart.showItems(); // O estado agora deve voltar a ter "Laptop" e "Mouse"
    }
}
