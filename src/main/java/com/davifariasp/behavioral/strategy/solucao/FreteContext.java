package com.davifariasp.behavioral.strategy.solucao;

public class FreteContext {

    private final CalculoFrete calculoFrete;

    public FreteContext(CalculoFrete calculoFrete) {
        this.calculoFrete = calculoFrete;
    }

    public double calcularFrete(double peso) {
        return calculoFrete.calcularFrete(peso);
    }
}
