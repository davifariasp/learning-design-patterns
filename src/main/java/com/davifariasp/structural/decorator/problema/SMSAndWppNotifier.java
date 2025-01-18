package com.davifariasp.structural.decorator.problema;

public class SMSAndWppNotifier extends Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
        System.out.println("Sending WhatsApp: " + message);
    }
}
