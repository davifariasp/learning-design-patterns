package com.davifariasp.structural.adapter.solucao;

public class NotificationAdapter implements Notifier {

    private LegacyNotifier legacyNotifier;

    public NotificationAdapter(LegacyNotifier legacyNotifier){
        this.legacyNotifier = legacyNotifier;
    }

    @Override
    public void notify(String title, String message) {

        String fullMesssage = "Title: " + title + "\nMessage: " + message;

        legacyNotifier.sedNotification(fullMesssage);
    }
}
