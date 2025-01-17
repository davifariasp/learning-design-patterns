package com.davifariasp.structural.composite.solucao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 10);
        Produto p2 = new Produto("Produto 2", 20);
        Produto p3 = new Produto("Produto 3", 30);
        Produto p4 = new Produto("Produto 4", 40);

        Caixa caixaMenor = new Caixa(List.of(p1, p2));

        Caixa caixaMaior = new Caixa(List.of(p3, p4, caixaMenor));

        System.out.println(caixaMaior.getValor());
    }
}
