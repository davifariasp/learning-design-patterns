package com.davifariasp.behavioral.iterator.solucao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loja {
    private List<Produto> promocoes = new ArrayList<Produto>();
    private Map<String, List<Produto>> estoque = new HashMap<String, List<Produto>>();

    public void adicionarPromocao(Produto produto) {
        promocoes.add(produto);
    }

    public void adicionarEstoque(String categoria, Produto produto) {
        if (!estoque.containsKey(categoria)) {
            estoque.put(categoria, new ArrayList<Produto>());
        }

        estoque.get(categoria).add(produto);
    }

    public void getPromocoes() {
        Iterator<Produto> iterator = new PromocaoIterator(promocoes);

        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println(produto.nome);
        }
    }

    public void getEstoque() {
        Iterator<Produto> iterator = new EstoqueIterator(estoque);

        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println(produto.nome);
        }
    }
}
