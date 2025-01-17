package com.davifariasp.structural.composite.solucao;

public class Produto implements Item{
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
