package com.davifariasp.behavioral.visitor.solucao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = List.of(
            new Livro("Livro", 100),
            new Eletronico("Eletronico", 100)
        );

        Visitor visitor = new CalculadoraFreteVisitor();

        produtos.forEach(produto -> produto.aceitar(visitor));
    }
}
