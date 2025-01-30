package com.davifariasp.behavioral.visitor.solucao;

public interface Visitor {
    void visit(Livro livro);
    void visit(Eletronico eletronico);
}
