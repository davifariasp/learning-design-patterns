package com.davifariasp.creational.prototype.problema;

import java.time.LocalDateTime;

public class Documento {
    private String titulo;
    private String conteudo;
    private LocalDateTime dataCriacao;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCriacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Documento [\ntitulo=" + titulo + ",\nconteudo=" + conteudo + ",\ndataCriacao=" + dataCriacao + "\n]";
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
}
