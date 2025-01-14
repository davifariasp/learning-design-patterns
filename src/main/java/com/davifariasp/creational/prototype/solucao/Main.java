package com.davifariasp.creational.prototype.solucao;

public class Main {

    public static void main(String[] args) {
        Documento documento = new Documento("Relatório", "Conteudo do Relatório");
        System.out.println(documento);
        System.out.println(documento.hashCode());

        Documento documento2 = documento;

        System.out.println(documento2.hashCode());

        //criando cópia
        Documento documentoCopia = (Documento) documento.clone();

        System.out.println(documentoCopia.hashCode());
        System.out.println(documentoCopia);
    }
}
