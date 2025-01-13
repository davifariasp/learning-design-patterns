package com.davifariasp.creational.factorymethod.solucao;

public class CurrentAccount implements IBankAccount {

    @Override
    public void processTransaction() {
        System.out.println("Processando transação na Conta Corrente.");
    }
}
