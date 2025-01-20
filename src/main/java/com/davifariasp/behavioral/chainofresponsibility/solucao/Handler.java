package com.davifariasp.behavioral.chainofresponsibility.solucao;

public interface Handler {
    Handler setNext(Handler handler);
    void handle(Ticket ticket);
}
