package com.davifariasp.behavioral.templatemethod.problema;

public class PayamentProcessor {

    public void processPayament(String payamentType){
        validatePayament();
        authorizePayament(payamentType);
        completePayament();
    }

    private void validatePayament(){
        System.out.println("Validating payament..");
    }

    private void authorizePayament(String type){
        if(type.equals("credit")) {
            System.out.println("Authorizing credit payament..");
        } else if(type.equals("boleto")) {
            System.out.println("Authorizing boleto payament..");
        } else if (type.equals("paypal")) {
            System.out.println("Redirecting to PayPal..");
        }
    }

    private void completePayament(){
        System.out.println("Completing payament..");
    }

}
