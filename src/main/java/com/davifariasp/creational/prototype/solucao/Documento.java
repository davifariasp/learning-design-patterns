package com.davifariasp.creational.prototype.solucao;

import java.time.LocalDateTime;

public class Documento implements Prototype {
    private String titulo;
    private String conteudo;
    private LocalDateTime dataCriacao;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCriacao = LocalDateTime.now();
    }

    private Documento(Documento documento){
        this.titulo = documento.titulo;
        this.conteudo = documento.conteudo;
        this.dataCriacao = documento.dataCriacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public String toString() {
        return "Documento [\ntitulo=" + titulo + ",\nconteudo=" + conteudo + ",\ndataCriacao=" + dataCriacao + "\n]";
    }

    @Override
    public Prototype clone() {
        return new Documento(this);
    }

}
