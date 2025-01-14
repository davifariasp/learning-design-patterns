package com.davifariasp.creational.abstractfactory.solucao.creatures;

import com.davifariasp.creational.abstractfactory.solucao.interfaces.Creature;

public class OrcWarrior implements Creature {

    @Override
    public void spawn() {
        System.out.println("Gerando Guerreiro Orc...");
    }
}
