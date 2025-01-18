package com.davifariasp.structural.decorator.problema;

public class Application {
    private Notifier notifier;

    public Application(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message) {
        notifier.send(message);
    }

}
