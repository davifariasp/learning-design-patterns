package com.davifariasp.structural.decorator.solucao;

public class Main {
    public static void main(String[] args) {

        //enviando notificacao somente por Sms
        SMSDecorator smsDecorator = new SMSDecorator(new Notifier());

        System.out.println("Enviando notificacao somente por SMS");
        Application application1 = new Application(smsDecorator);
        application1.sendNotification("Hello World");

        //Enviando notificacao por SMS e WhatsApp
        System.out.println("\nEnviando notificacao por SMS e WhatsApp");
        NotifierDecorator notifierDecorator = new NotifierDecorator(new SMSDecorator(new WhatsAppDecorator(new Notifier())));

        Application application2 = new Application(notifierDecorator);
        application2.sendNotification("Hello World");
    }
}
