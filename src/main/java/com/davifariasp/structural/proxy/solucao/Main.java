package com.davifariasp.structural.proxy.solucao;

public class Main {
    public static void main(String[] args) {
        WelcomeMessageProxy welcomeMessageProxy = new WelcomeMessageProxy();
        welcomeMessageProxy.sendMessage("Davi");
    }
}
