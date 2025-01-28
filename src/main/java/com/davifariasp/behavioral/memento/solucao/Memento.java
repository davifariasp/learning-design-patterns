package com.davifariasp.behavioral.memento.solucao;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<String> state;

    public Memento(List<String> state){
        this.state = new ArrayList<> (state);
    }

    public List<String> getState(){
        return state;
    }
}
