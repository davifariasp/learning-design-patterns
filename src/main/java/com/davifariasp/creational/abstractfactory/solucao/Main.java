package com.davifariasp.creational.abstractfactory.solucao;

import com.davifariasp.creational.abstractfactory.solucao.factorys.ElfFactory;
import com.davifariasp.creational.abstractfactory.solucao.factorys.OrcFactory;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.FactionFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário
        System.out.print("Digite o tipo de criatura: ");

        // Lê a entrada do usuário como uma String
        int factionType = Integer.parseInt(scanner.nextLine());

        FactionFactory factionFactory = switch (factionType) {
            case 1 -> new ElfFactory();
            case 2 -> new OrcFactory();
            default -> throw new IllegalArgumentException("Facção inválida");
        };

        RPGGame game = new RPGGame(factionFactory);
        game.spawnEntities();

    }
}
