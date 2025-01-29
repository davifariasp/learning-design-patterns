package com.davifariasp.behavioral.strategy.solucao;

import com.davifariasp.behavioral.strategy.solucao.strategies.CorreiosFrete;
import com.davifariasp.behavioral.strategy.solucao.strategies.FedExFrete;
import com.davifariasp.behavioral.strategy.solucao.strategies.UPSFrete;

public class Main {
    public static void main(String[] args) {

            //correios
            FreteContext freteContext = new FreteContext(new CorreiosFrete());
            System.out.println(freteContext.calcularFrete(10));

            //fedex
            freteContext = new FreteContext(new FedExFrete());
            System.out.println(freteContext.calcularFrete(10));

            //UPS
            freteContext = new FreteContext(new UPSFrete());
            System.out.println(freteContext.calcularFrete(10));
    }
}
