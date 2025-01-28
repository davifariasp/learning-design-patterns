package com.davifariasp.behavioral.mediator.solucao;

public class EcomerceMediator implements Mediator {
    private PayamentSystem payamentSystem;
    private StockSystem stockSystem;
    private ShippingSystem shippingSystem;

    public EcomerceMediator(){
        this.payamentSystem = new PayamentSystem();
        this.stockSystem = new StockSystem();
        this.shippingSystem = new ShippingSystem();
    }

    @Override
    public void finalizePurchase(){
        payamentSystem.processPayament();
        stockSystem.reduceStock();
        shippingSystem.shipProduct();
    }
}
