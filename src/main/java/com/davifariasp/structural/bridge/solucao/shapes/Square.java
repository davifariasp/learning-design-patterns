package com.davifariasp.structural.bridge.solucao.shapes;

import com.davifariasp.structural.bridge.solucao.interfaces.Shape;
import com.davifariasp.structural.bridge.solucao.interfaces.Color;

public class Square extends Shape {
    private final int sideLength;

    public Square(int sideLength, Color color) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um quadrado de lado " + this.sideLength);
        color.applyColor();
    }
}
