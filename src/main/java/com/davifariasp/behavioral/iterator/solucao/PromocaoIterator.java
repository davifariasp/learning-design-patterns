package com.davifariasp.behavioral.iterator.solucao;

import java.util.List;

public class PromocaoIterator implements Iterator<Produto>{

    private List<Produto> promocoes;
    private int posicao = 0;

    public PromocaoIterator(List<Produto> promocoes) {
        this.promocoes = promocoes;
    }

    @Override
    public boolean hasNext() {
        return posicao < promocoes.size();
    }

    @Override
    public Produto next() {
        Produto produto = promocoes.get(posicao);
        posicao++;
        return produto;
    }
}
