package com.davifariasp.behavioral.iterator.solucao;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        var produto1 = new Produto("Produto 1");
        var produto2 = new Produto("Produto 2");
        var produto3 = new Produto("Produto 3");

        loja.adicionarEstoque("Categoria 1", produto1);
        loja.adicionarEstoque("Categoria 2", produto2);
        loja.adicionarEstoque("Categoria 3", produto3);

        loja.adicionarPromocao(produto1);

        System.out.println("Produtos em promoção:");
        loja.getPromocoes();

        System.out.println("\nProdutos no estoque:");
        loja.getEstoque();
    }
}
