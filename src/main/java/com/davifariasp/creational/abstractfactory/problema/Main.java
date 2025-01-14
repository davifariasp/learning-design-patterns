package com.davifariasp.creational.abstractfactory.problema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário
        System.out.print("Digite o tipo de criatura: ");

        // Lê a entrada do usuário como uma String
        int factionType = Integer.parseInt(scanner.nextLine());

        if (factionType == 1) {
            System.out.println("Gerando Arqueiro Elfo...");
            System.out.println("Criando Arco de Elfo...");
        } else if (factionType == 2) {
            System.out.println("Gerando Guerreiro Orc...");
            System.out.println("Criando Machado Orc...");
        } else {
            throw new IllegalArgumentException("Facção inválida");
        }

    }
}
