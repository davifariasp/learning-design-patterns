package com.davifariasp.structural.composite.solucao;

import java.util.List;

public class Caixa implements Item {
    private List<Item> itens;

    public Caixa(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public double getValor() {
        double valorTotal = 0;

        for (Item item : itens) {
            valorTotal += item.getValor();
        }

        return valorTotal;
    }
}
