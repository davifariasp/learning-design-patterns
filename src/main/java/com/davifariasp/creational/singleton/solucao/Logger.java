package com.davifariasp.creational.singleton.solucao;

public class Logger {

    private static Logger instance;

    //com o construtor privado, não é possível instanciar a classe Logger fora dela
    private Logger(){}

    public static Logger instance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("Log: " + message);
    }
}
