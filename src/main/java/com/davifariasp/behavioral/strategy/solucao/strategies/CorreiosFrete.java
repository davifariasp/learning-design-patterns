package com.davifariasp.behavioral.strategy.solucao.strategies;

import com.davifariasp.behavioral.strategy.solucao.CalculoFrete;

public class CorreiosFrete implements CalculoFrete {

    @Override
    public double calcularFrete(double peso) {
        return peso * 10;
    }
}
