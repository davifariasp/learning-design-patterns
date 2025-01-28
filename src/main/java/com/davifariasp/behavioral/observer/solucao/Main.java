package com.davifariasp.behavioral.observer.solucao;

public class Main {
    public static void main(String[] args) {
        Iventory iventory = new Iventory();

        Marketing marketing = new Marketing();
        Customer customer = new Customer();

        iventory.attach(marketing);
        iventory.attach(customer);

        iventory.updateStock();
    }
}
