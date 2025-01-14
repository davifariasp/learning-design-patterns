package com.davifariasp.creational.abstractfactory.solucao.factorys;

import com.davifariasp.creational.abstractfactory.solucao.creatures.OrcWarrior;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.Creature;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.FactionFactory;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.Weapon;
import com.davifariasp.creational.abstractfactory.solucao.weapons.OrcAxe;

public class OrcFactory implements FactionFactory {

    @Override
    public Creature createCreature() {
        return new OrcWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new OrcAxe();
    }
}
