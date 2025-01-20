package com.davifariasp.structural.facade.solucao;


public class Main {

    public static void main(String[] args) {
        CheckoutFacade checkoutFacade = new CheckoutFacade();
        checkoutFacade.checkout("Product 1", "Credit Card");
    }
}
