package com.davifariasp.structural.decorator.solucao;

import com.davifariasp.structural.decorator.solucao.Notifier;

public class Application {
    protected Notifier notifier;

    public Application(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message) {
        notifier.send(message);
    }

}
