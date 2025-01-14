package com.davifariasp.creational.builder.problema;

public class Pedido {
    String item;
    int quantidade;
    double precoUnitario;
    String tipoEntrega;
    String promocao;
    String cliente;
    String cupom;

    public Pedido(String item, int quantidade, double precoUnitario, String tipoEntrega, String promocao, String cliente, String cupom) {
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.tipoEntrega = tipoEntrega;
        this.promocao = promocao;
        this.cliente = cliente;
        this.cupom = cupom;
    }

    public void show() {
        System.out.println("Item: " + item);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Tipo de Entrega: " + tipoEntrega);
        System.out.println("Promoção: " + promocao);
        System.out.println("Cliente: " + cliente);
        System.out.println("Cupom: " + cupom);
    }
}
