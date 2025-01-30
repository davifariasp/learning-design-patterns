package com.davifariasp.behavioral.visitor.problema;

public class Livro extends Produto {

    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularFrete() {
        return getPreco() * 0.01;
    }

}
