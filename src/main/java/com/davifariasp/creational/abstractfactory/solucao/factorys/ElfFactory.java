package com.davifariasp.creational.abstractfactory.solucao.factorys;

import com.davifariasp.creational.abstractfactory.solucao.creatures.ElfArcher;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.Creature;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.FactionFactory;
import com.davifariasp.creational.abstractfactory.solucao.interfaces.Weapon;
import com.davifariasp.creational.abstractfactory.solucao.weapons.ElfBow;

public class ElfFactory implements FactionFactory {

    @Override
    public Creature createCreature() {
        return new ElfArcher();
    }

    @Override
    public Weapon createWeapon() {
        return new ElfBow();
    }
}
