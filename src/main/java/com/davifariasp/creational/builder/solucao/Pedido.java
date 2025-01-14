package com.davifariasp.creational.builder.solucao;

public class Pedido {
    private String item;
    private int quantidade;
    private double precoUnitario;
    private String tipoEntrega;
    private String promocao;
    private String cliente;
    private String cupom;

    public Pedido(){}

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
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
