package com.davifariasp.behavioral.state.solucao.states;

import com.davifariasp.behavioral.state.solucao.OrderContext;
import com.davifariasp.behavioral.state.solucao.OrderState;

public class NewState implements OrderState {

    @Override
    public void process(OrderContext context) {
        System.out.println("Processando novo pedido");
        context.setState(new ProcessingState());
    }
}
