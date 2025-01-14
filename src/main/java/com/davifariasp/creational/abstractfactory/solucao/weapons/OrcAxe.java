package com.davifariasp.creational.abstractfactory.solucao.weapons;

import com.davifariasp.creational.abstractfactory.solucao.interfaces.Weapon;

public class OrcAxe implements Weapon {

    @Override
    public void create() {
        System.out.println("Gerando Machado Orc...");
    }
}
