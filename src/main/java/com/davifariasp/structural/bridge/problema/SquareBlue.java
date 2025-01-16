package com.davifariasp.structural.bridge.problema;

public class SquareBlue {
    private final int sideLength;
    private final String color;

    public SquareBlue(int sideLength){
        this.sideLength = sideLength;
        this.color = "Azul";
    }

    public void draw(){
        System.out.println("Desenhando um quadrado de lado " + this.sideLength + " e cor " + this.color);
    }
}
