package com.davifariasp.behavioral.strategy.solucao.strategies;

import com.davifariasp.behavioral.strategy.solucao.CalculoFrete;

public class UPSFrete implements CalculoFrete {

    @Override
    public double calcularFrete(double peso) {
        return peso * 12;
    }
}
