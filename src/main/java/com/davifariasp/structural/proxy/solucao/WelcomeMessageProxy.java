package com.davifariasp.structural.proxy.solucao;

public class WelcomeMessageProxy implements WelcomeMessageInterface{

    private WelcomeMessage welcomeMessage = new WelcomeMessage();

    @Override
    public void sendMessage(String person) {
        welcomeMessage.sendMessage(person);
        System.out.println("Bem-vindo " + person);
    }
}
