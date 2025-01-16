package com.davifariasp.structural.adapter.problema;

public class Main {
    public static void main(String[] args) {
        Notify notify = new Notify("Title", "Message");

        LegacyNotifier legacyNotifier = new LegacyNotifier();

        notify.sendNotification();

        legacyNotifier.sedNotification("Mensagem");

    }
}
