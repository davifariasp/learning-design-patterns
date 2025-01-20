package com.davifariasp.behavioral.chainofresponsibility.solucao;

public class Main {
    public static void main(String[] args) {

            Ticket ticket = new Ticket();
            ticket.dificuldade = "Alta";

            LevelOneSupport suporteNivel1 = new LevelOneSupport();
            LevelTwoSupport suporteNivel2 = new LevelTwoSupport();
            SpecialistSupport especialista = new SpecialistSupport();

            suporteNivel1.setNext(suporteNivel2).setNext(especialista);

            suporteNivel1.handle(ticket);
    }
}
