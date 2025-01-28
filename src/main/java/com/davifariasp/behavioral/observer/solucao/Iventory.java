package com.davifariasp.behavioral.observer.solucao;

import java.util.ArrayList;
import java.util.List;

public class Iventory {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String message){
        observers.forEach( observer -> observer.update(message));
    }

    public void updateStock(){
        System.out.println("Estoque atualizado");

        notifyObservers("Estoque atualizado");
    }
}
