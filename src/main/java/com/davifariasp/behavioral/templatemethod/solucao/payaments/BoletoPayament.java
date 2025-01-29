package com.davifariasp.behavioral.templatemethod.solucao.payaments;

import com.davifariasp.behavioral.templatemethod.solucao.PayamentProcessorTemplate;

public class BoletoPayament extends PayamentProcessorTemplate {
    @Override
    protected void authorizePayament() {
        System.out.println("Authorizing boleto payament..");
    }
}
