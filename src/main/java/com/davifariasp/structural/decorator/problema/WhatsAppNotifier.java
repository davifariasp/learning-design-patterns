package com.davifariasp.structural.decorator.problema;

public class WhatsAppNotifier extends Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp: " + message);
    }
}
