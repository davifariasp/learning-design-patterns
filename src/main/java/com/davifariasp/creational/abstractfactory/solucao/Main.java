package com.davifariasp.creational.abstractfactory.solucao;

import com.davifariasp.creational.abstractfactory.solucao.factorys.ElfFactory;
import com.davifariasp.creational.abstractfactory.solucao.factorys.OrcFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário
        System.out.print("Digite o tipo de criatura: ");

        // Lê a entrada do usuário como uma String
        int factionType = Integer.parseInt(scanner.nextLine());

        switch (factionType) {
            case 1:
                RPGGame game = new RPGGame(new ElfFactory());
                game.spawnEntities();
                break;
            case 2:
                RPGGame game2 = new RPGGame(new OrcFactory());
                game2.spawnEntities();
                break;
            default:
                throw new IllegalArgumentException("Facção inválida");
        }

    }
}
