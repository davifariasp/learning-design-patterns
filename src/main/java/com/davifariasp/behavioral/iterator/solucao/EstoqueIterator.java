package com.davifariasp.behavioral.iterator.solucao;

import java.util.List;
import java.util.Map;

public class EstoqueIterator implements Iterator<Produto> {
    private Map<String, List<Produto>> estoque;
    private String[] categorias;
    private int posicaoCategoria = 0;
    private int posicaoProduto = 0;

    public EstoqueIterator(Map<String, List<Produto>> estoque) {
        this.estoque = estoque;
        this.categorias = estoque.keySet().toArray(new String[0]);
    }

    @Override
    public boolean hasNext() {
        if (posicaoCategoria < categorias.length) {
            if (posicaoProduto < estoque.get(categorias[posicaoCategoria]).size()) {
                return true;
            } else {
                posicaoCategoria++;
                posicaoProduto = 0;
                return hasNext();
            }
        }
        return false;
    }

    @Override
    public Produto next() {
        Produto produto = estoque.get(categorias[posicaoCategoria]).get(posicaoProduto);
        posicaoProduto++;
        return produto;
    }
}
