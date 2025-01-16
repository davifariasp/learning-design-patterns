package com.davifariasp.structural.adapter.problema;

public class NewNotifier implements Notifier {

    @Override
    public void notify(String title, String message) {
        System.out.println("Notificação enviada: " + title + " - " + message);
    }
}
