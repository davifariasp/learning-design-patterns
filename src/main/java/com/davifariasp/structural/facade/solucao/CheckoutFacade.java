package com.davifariasp.structural.facade.solucao;

public class CheckoutFacade {
    private InventoryService inventoryService;
    private PayamentService payamentService;

    public CheckoutFacade() {
        this.inventoryService = new InventoryService();
        this.payamentService = new PayamentService();
    }

    public void checkout(String product, String type){
        inventoryService.checkStock(product);
        payamentService.pay(type);
    }
}
