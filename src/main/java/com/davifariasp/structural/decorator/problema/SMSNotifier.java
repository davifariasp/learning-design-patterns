package com.davifariasp.structural.decorator.problema;

public class SMSNotifier extends Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
