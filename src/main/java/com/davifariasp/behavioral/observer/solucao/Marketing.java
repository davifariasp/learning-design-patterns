package com.davifariasp.behavioral.observer.solucao;

public class Marketing implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Marketing notificado: " + message);
    }
}
