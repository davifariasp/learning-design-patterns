package com.davifariasp.structural.facade.problema;

public class Main {

    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        PayamentService payamentService = new PayamentService();

        inventoryService.checkStock("Product 1");
        payamentService.pay("Credit Card");
    }
}
