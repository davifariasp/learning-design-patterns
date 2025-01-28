package com.davifariasp.behavioral.observer.solucao;

public class Customer implements Observer{

    @Override
    public void update(String message) {
        System.out.println("Clientes notificados: " + message);
    }
}
