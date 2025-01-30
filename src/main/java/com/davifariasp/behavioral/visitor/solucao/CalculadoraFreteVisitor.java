package com.davifariasp.behavioral.visitor.solucao;

public class CalculadoraFreteVisitor implements Visitor {

    @Override
    public void visit(Livro livro) {
        System.out.println("Frete do livro " + livro.getNome() + ": " + livro.getPreco() * 0.01);
    }

    @Override
    public void visit(Eletronico eletronico) {
        System.out.println("Frete do eletronico " + eletronico.getNome() + ": " + eletronico.getPreco() * 0.02);
    }
}
