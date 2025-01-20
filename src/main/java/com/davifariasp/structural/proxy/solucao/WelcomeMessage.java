package com.davifariasp.structural.proxy.solucao;

public class WelcomeMessage implements WelcomeMessageInterface{

    @Override
    public void sendMessage(String person) {
        System.out.println("Welcome " + person);
    }
}
