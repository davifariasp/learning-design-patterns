package com.davifariasp.behavioral.visitor.problema;

public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularFrete() {
        return getPreco() * 0.02;
    }
}
