package com.davifariasp.structural.bridge.solucao;

import com.davifariasp.structural.bridge.solucao.colors.BlueColor;
import com.davifariasp.structural.bridge.solucao.colors.RedColor;
import com.davifariasp.structural.bridge.solucao.shapes.Circle;
import com.davifariasp.structural.bridge.solucao.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, new RedColor());
        circle.draw();

        Square square = new Square(10, new BlueColor());
        square.draw();
    }
}
