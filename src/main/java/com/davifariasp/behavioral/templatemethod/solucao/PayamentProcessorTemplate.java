package com.davifariasp.behavioral.templatemethod.solucao;

public abstract class PayamentProcessorTemplate {
    public void processPayament(){
        validatePayament();
        authorizePayament();
        completePayament();
    }

    private void validatePayament(){
        System.out.println("Validating payament..");
    }

    protected abstract void authorizePayament();

    private void completePayament(){
        System.out.println("Completing payament..");
    }
}
