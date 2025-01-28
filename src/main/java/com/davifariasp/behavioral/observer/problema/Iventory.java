package com.davifariasp.behavioral.observer.problema;

public class Iventory {

    public void updateStock(){
        System.out.println("Estoque atualizado");

        notifyMarketing();
        notifyCustomers();
    }

    public void notifyMarketing(){
        System.out.println("Notificando ao time de marketing");
    }

    public void notifyCustomers(){
        System.out.println("Notificando os clientes");
    }
}
