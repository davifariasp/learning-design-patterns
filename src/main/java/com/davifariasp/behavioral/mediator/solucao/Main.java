package com.davifariasp.behavioral.mediator.solucao;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new EcomerceMediator();

        mediator.finalizePurchase();
    }
}
