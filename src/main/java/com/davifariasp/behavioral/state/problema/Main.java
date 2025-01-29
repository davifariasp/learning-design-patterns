package com.davifariasp.behavioral.state.problema;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.setStatus("New");

        order.processOrder();
        order.processOrder();
        order.processOrder();
        order.processOrder();
        order.processOrder();
    }
}
