package com.davifariasp.behavioral.state.solucao;

public class OrderContext {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public OrderContext(OrderState initialState){
        this.state = initialState;
    }

    public void process(){
        state.process(this);
    }
}
