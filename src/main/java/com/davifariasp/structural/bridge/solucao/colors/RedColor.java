package com.davifariasp.structural.bridge.solucao.colors;

import com.davifariasp.structural.bridge.solucao.interfaces.Color;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Aplicando cor vermelha");
    }
}
