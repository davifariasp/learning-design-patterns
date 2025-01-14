package com.davifariasp.creational.abstractfactory.solucao.weapons;

import com.davifariasp.creational.abstractfactory.solucao.interfaces.Weapon;

public class ElfBow implements Weapon {

    @Override
    public void create() {
        System.out.println("Gerando Arco Elfo...");
    }
}
