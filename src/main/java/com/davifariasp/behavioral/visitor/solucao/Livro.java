package com.davifariasp.behavioral.visitor.solucao;

public class Livro extends Produto {

    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularFrete() {
        return getPreco() * 0.01;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visit(this);
    }
}
