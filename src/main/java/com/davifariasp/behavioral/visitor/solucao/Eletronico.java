package com.davifariasp.behavioral.visitor.solucao;

public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularFrete() {
        return getPreco() * 0.02;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visit(this);
    }
}
