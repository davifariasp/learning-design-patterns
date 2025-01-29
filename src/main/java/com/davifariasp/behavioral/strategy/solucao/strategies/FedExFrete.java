package com.davifariasp.behavioral.strategy.solucao.strategies;

import com.davifariasp.behavioral.strategy.solucao.CalculoFrete;

public class FedExFrete implements CalculoFrete {

    @Override
    public double calcularFrete(double peso) {
        return peso * 15 + 20;
    }
}
