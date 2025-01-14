package com.davifariasp.creational.builder.solucao;

public class PedidoBuilder {
    private final Pedido pedido;

    public PedidoBuilder() {
        pedido = new Pedido();
    }

    public PedidoBuilder comItem(String item) {
        pedido.setItem(item);
        return this;
    }

    public PedidoBuilder comQuantidade(int quantidade) {
        pedido.setQuantidade(quantidade);
        return this;
    }

    public PedidoBuilder comPrecoUnitario(double precoUnitario) {
        pedido.setPrecoUnitario(precoUnitario);
        return this;
    }

    public PedidoBuilder comTipoEntrega(String tipoEntrega) {
        pedido.setTipoEntrega(tipoEntrega);
        return this;
    }

    public PedidoBuilder comPromocao(String promocao) {
        pedido.setPromocao(promocao);
        return this;
    }

    public PedidoBuilder comCliente(String cliente) {
        pedido.setCliente(cliente);
        return this;
    }

    public PedidoBuilder comCupom(String cupom) {
        pedido.setCupom(cupom);
        return this;
    }

    public Pedido build() {
        return pedido;
    }
}
