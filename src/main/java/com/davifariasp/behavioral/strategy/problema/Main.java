package com.davifariasp.behavioral.strategy.problema;

public class Main {
    public static void main(String[] args) {

        FreteService freteService = new FreteService();

        System.out.println(freteService.calcularFrete("Correios", 10));
        System.out.println(freteService.calcularFrete("FeDEx", 10));
        System.out.println(freteService.calcularFrete("UPS", 10));
    }
}
