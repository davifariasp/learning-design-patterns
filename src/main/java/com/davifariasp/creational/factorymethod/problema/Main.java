package com.davifariasp.creational.factorymethod.problema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário
        System.out.print("Digite o tipo de conta: ");

        // Lê a entrada do usuário como uma String
        int accountType = Integer.parseInt(scanner.nextLine());

        if(accountType == 1) {
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.processTransaction();
        } else if(accountType == 2) {
            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.processTransaction();
        } else {
            throw new IllegalArgumentException("Invalid account type");
        }

    }
}
