package com.davifariasp.structural.decorator.problema;

public class Main {
    public static void main (String[] args) {
        //Primeira versao
        Application application1 = new Application(new SMSNotifier());
        System.out.println("Primeira versao");
        application1.sendNotification("Hello World");


        //Segunda versao
        Application application2 = new Application(new SMSAndWppNotifier());
        System.out.println("\nSegunda versao");
        application2.sendNotification("Hello World");
    }
}
