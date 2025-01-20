package com.davifariasp.behavioral.chainofresponsibility.solucao;

public class SpecialistSupport implements Handler{
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolvido pelo Especialista");
    }
}
