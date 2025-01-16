package com.davifariasp.structural.bridge.problema;

public class CircleRed {
    private final int radius;
    private final String color;

    public CircleRed(int radius){
        this.radius = radius;
        this.color = "Vermelho";
    }

    public void draw(){
        System.out.println("Desenhando um círculo de raio " + this.radius + " e cor " + this.color);
    }
}
