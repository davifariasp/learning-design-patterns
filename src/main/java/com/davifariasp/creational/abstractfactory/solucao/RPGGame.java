package com.davifariasp.creational.abstractfactory.solucao;

import com.davifariasp.creational.abstractfactory.solucao.interfaces.Creature;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.FactionFactory;

public class RPGGame {

    private FactionFactory factionFactory;

    public RPGGame(FactionFactory factionFactory) {
        this.factionFactory = factionFactory;
    }

    public void spawnEntities() {
        factionFactory.createCreature().spawn();
        factionFactory.createWeapon().create();
    }
}
