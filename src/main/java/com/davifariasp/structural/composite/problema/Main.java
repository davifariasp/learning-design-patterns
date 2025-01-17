package com.davifariasp.structural.composite.problema;

import java.util.List;

public class Main {
    public static void main (String[] args) {

        //Produto simples
        Produto produto1 = new Produto("Produto 1", 10);
        Produto produto2 = new Produto("Produto 2", 20);

        //Caixas menor
        Caixa caixaMenor = new Caixa(List.of(produto1), List.of());

        //Caixa maior
        Caixa caixaMaior = new Caixa(List.of(produto2), List.of(caixaMenor));

        //Valor total
        System.out.println(caixaMaior.getValor());
    }
}
