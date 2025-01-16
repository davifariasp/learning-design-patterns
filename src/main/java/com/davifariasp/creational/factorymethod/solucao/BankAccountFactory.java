package com.davifariasp.creational.factorymethod.solucao;

public class BankAccountFactory {

    public static BankAccount createAccount(int accountType) throws IllegalArgumentException {
        return switch (accountType) {
            case 1 -> new SavingsAccount();
            case 2 -> new CurrentAccount();
            default -> throw new IllegalArgumentException("Invalid account type");
        };
    }
}
