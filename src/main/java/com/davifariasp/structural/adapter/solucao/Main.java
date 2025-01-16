package com.davifariasp.structural.adapter.solucao;

public class Main {
    public static void main(String[] args) {

        LegacyNotifier legacyNotifier = new LegacyNotifier();

        NotificationAdapter notificationAdapter = new NotificationAdapter(legacyNotifier);

        notificationAdapter.notify("Title", "Message");
    }
}
