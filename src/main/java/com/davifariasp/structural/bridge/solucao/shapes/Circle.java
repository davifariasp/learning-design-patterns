package com.davifariasp.structural.bridge.solucao.shapes;

import com.davifariasp.structural.bridge.solucao.interfaces.Shape;
import com.davifariasp.structural.bridge.solucao.interfaces.Color;

public class Circle extends Shape {

    private final int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um círculo de raio " + this.radius);
        this.color.applyColor();
    }
}
