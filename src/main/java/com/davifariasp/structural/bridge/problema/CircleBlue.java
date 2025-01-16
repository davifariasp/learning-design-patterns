package com.davifariasp.structural.bridge.problema;

public class CircleBlue {
    private final int radius;
    private final String color;

    public CircleBlue(int radius){
        this.radius = radius;
        this.color = "Azul";
    }

    public void draw(){
        System.out.println("Desenhando um círculo de raio " + this.radius + " e cor " + this.color);
    }
}

