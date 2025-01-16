package com.davifariasp.creational.factorymethod.solucao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário
        System.out.print("Digite o tipo de conta: ");

        // Lê a entrada do usuário como uma String
        int accountType = Integer.parseInt(scanner.nextLine());

        BankAccount account = BankAccountFactory.createAccount(accountType);

        //chama o método para processar transação
        account.processTransaction();
    }
}
