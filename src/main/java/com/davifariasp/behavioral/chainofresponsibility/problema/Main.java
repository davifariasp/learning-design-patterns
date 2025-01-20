package com.davifariasp.behavioral.chainofresponsibility.problema;

public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        ticket.dificuldade = "Baixa";

        System.out.println(handleTicket(ticket));
    }

    public static String handleTicket(Ticket ticket){
        if (ticket.dificuldade.equals("Baixa")){
            return "Suporte Nivel 1";
        } else if (ticket.dificuldade.equals("Media")){
            return "Suporte Nivel 2";
        } else {
            return "Especialista";
        }
    }
}
