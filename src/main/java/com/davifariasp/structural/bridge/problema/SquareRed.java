package com.davifariasp.structural.bridge.problema;

public class SquareRed {
    private final int sideLength;
    private final String color;

    public SquareRed(int sideLength){
        this.sideLength = sideLength;
        this.color = "Vermelho";
    }

    public void draw(){
        System.out.println("Desenhando um quadrado de lado " + this.sideLength + " e cor " + this.color);
    }
}
