package com.davifariasp.structural.composite.problema;

import java.util.List;

public class Caixa {
    private List<Produto> produtos;
    private List<Caixa> caixas;

    public Caixa(List<Produto> produtos, List<Caixa> caixas) {
        this.produtos = produtos;
        this.caixas = caixas;
    }

    public double getValor() {
        double valor = 0;
        for (Produto produto : produtos) {
            valor += produto.getValor();
        }
        for (Caixa caixa : caixas) {
            valor += caixa.getValor();
        }
        return valor;
    }
}
