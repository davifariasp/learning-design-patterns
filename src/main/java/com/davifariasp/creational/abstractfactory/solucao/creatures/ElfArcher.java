package com.davifariasp.creational.abstractfactory.solucao.creatures;

import com.davifariasp.creational.abstractfactory.solucao.interfaces.Creature;

public class ElfArcher implements Creature {

    @Override
    public void spawn() {
        System.out.println("Gerando Arqueiro Elfo...");
    }
}
