package com.davifariasp.creational.builder.solucao;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
            .comItem("Camisa")
            .comQuantidade(2)
            .comPrecoUnitario(50.0)
            .comTipoEntrega("Entrega Rápida")
            .comPromocao("Promoção de Natal")
            .comCliente("Davi")
            .comCupom("NATAL10")
            .build();

        pedido.show();
    }
}
