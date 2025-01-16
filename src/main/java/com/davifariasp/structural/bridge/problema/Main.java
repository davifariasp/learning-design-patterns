package com.davifariasp.structural.bridge.problema;

public class Main {

    public static void main(String[] args) {
        CircleBlue circleBlue = new CircleBlue(5);
        CircleRed circleRed = new CircleRed(5);

        SquareBlue squareBlue = new SquareBlue(10);
        SquareRed squareRed = new SquareRed(10);

        circleBlue.draw();
        circleRed.draw();

        squareBlue.draw();
        squareRed.draw();
    }
}
