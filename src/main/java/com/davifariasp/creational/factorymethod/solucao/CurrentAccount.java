package com.davifariasp.creational.factorymethod.solucao;

public class CurrentAccount implements BankAccount {

    @Override
    public void processTransaction() {
        System.out.println("Processando transação na Conta Corrente.");
    }
}
