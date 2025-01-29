package com.davifariasp.behavioral.state.solucao.states;

import com.davifariasp.behavioral.state.solucao.OrderContext;
import com.davifariasp.behavioral.state.solucao.OrderState;

public class ShippedState implements OrderState {

    @Override
    public void process(OrderContext context) {
        System.out.println("Pedido enviado");
        context.setState(new DeliveredState());
    }
}
