package com.davifariasp.behavioral.visitor.problema;

public class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("Livro", 100);
        Produto eletronico = new Eletronico("Eletronico", 100);

        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        System.out.println(calculadoraFrete.obterFrete(livro));
        System.out.println(calculadoraFrete.obterFrete(eletronico));
    }
}
