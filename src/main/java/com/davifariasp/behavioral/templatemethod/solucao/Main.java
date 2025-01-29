package com.davifariasp.behavioral.templatemethod.solucao;

import com.davifariasp.behavioral.templatemethod.solucao.payaments.BoletoPayament;
import com.davifariasp.behavioral.templatemethod.solucao.payaments.CreditCardPayament;
import com.davifariasp.behavioral.templatemethod.solucao.payaments.PayPalPayament;

public class Main {
    public static void main(String[] args) {
        PayamentProcessorTemplate payamentProcessor = new BoletoPayament();
        payamentProcessor.processPayament();

        payamentProcessor = new CreditCardPayament();
        payamentProcessor.processPayament();

        payamentProcessor = new PayPalPayament();
        payamentProcessor.processPayament();
    }
}
