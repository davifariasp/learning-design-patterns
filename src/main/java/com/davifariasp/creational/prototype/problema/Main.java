package com.davifariasp.creational.prototype.problema;

public class Main {

    public static void main(String[] args) {
        Documento documento = new Documento("Relatório", "Conteudo do Relatório");
        System.out.println(documento.toString());

        //criando cópia
        Documento documentoCopia = new Documento(documento.getTitulo(), documento.getConteudo());
    }
}
