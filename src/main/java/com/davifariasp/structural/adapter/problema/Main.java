package com.davifariasp.structural.adapter.problema;

public class Main {
    public static void main(String[] args) {
        LegacyNotifier legacyNotifier = new LegacyNotifier();

        legacyNotifier.sedNotification("Mensagem");

        NewNotifier newNotifier = new NewNotifier();

        newNotifier.notify("Title", "Message");
    }
}
