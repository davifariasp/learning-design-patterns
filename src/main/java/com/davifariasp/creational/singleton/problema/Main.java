package com.davifariasp.creational.singleton.problema;

public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();
        logger.log("Primeira mensagem");
        System.out.println(logger);

        Logger logger2 = new Logger();
        logger2.log("Segunda mensagem");
        System.out.println(logger2);
    }
}
