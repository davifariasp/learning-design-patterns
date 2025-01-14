package com.davifariasp.creational.builder.problema;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Camisa", 2, 50.0, "Entrega Rápida", "Promoção de Natal", "Davi", "NATAL10");
        pedido.show();
    }
}
