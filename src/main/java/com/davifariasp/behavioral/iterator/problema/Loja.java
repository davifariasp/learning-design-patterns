package com.davifariasp.behavioral.iterator.problema;

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
        for (Produto produto : promocoes) {
            System.out.println(produto.nome);
        }
    }

    public void getEstoque() {
        for (String categoria : estoque.keySet()) {
            System.out.println(categoria);
            for (Produto produto : estoque.get(categoria)) {
                System.out.println(produto.nome);
            }
        }
    }
}
