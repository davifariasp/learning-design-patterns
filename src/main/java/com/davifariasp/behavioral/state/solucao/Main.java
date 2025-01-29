package com.davifariasp.behavioral.state.solucao;

import com.davifariasp.behavioral.state.solucao.states.NewState;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext(new NewState());

        order.process();
        order.process();
        order.process();
        order.process();
        order.process();
    }
}
