package com.davifariasp.behavioral.visitor.problema;

public class CalculadoraFrete {
    public double obterFrete(Produto produto){
        if(produto instanceof Livro){
            return ((Livro) produto).calcularFrete();
        } else if(produto instanceof Eletronico){
            return ((Eletronico) produto).calcularFrete();
        }
        throw new IllegalArgumentException("Produto não suportado");
    }
}
