package com.davifariasp.behavioral.templatemethod.problema;

public class Main {
    public static void main(String[] args) {
        PayamentProcessor payamentProcessor = new PayamentProcessor();
        payamentProcessor.processPayament("boleto");
        payamentProcessor.processPayament("credit");
        payamentProcessor.processPayament("paypal");
    }
}
