package com.davifariasp.creational.singleton.solucao;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.instance();
        logger.log("Primeira mensagem");
        System.out.println(logger);

        Logger logger2 = Logger.instance();
        logger2.log("Segunda mensagem");
        System.out.println(logger2);
    }
}
