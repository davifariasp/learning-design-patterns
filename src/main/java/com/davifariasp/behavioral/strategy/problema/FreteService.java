package com.davifariasp.behavioral.strategy.problema;

public class FreteService {

    public double calcularFrete(String transportadora, double peso) {
        if (transportadora.equals("Correios")) {
            return peso * 0.01;
        } else if (transportadora.equals("FeDEx")) {
            return peso * 0.02;
        } else if (transportadora.equals("UPS")) {
            return peso * 0.03;
        } else {
            throw new IllegalArgumentException("Transportadora não encontrada");
        }
    }
}
