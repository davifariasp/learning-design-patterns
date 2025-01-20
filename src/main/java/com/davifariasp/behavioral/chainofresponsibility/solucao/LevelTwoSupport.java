package com.davifariasp.behavioral.chainofresponsibility.solucao;

public class LevelTwoSupport implements Handler {
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void handle(Ticket ticket) {
        if(ticket.dificuldade.equals("Média")){
            System.out.println("Ticket resolvido pelo suporte nível 2");
        }else{
            nextHandler.handle(ticket);
        }
    }
}
