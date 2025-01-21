package com.davifariasp.behavioral.command.solucao;

public class Main {
    public static void main(String[] args) {
        var invoker = new CommandInvoker();

        invoker.addCommand(new CreateFileCommand("file1.txt"));
        invoker.addCommand(new DeleteFileCommand("file1.txt"));
        invoker.executeCommands();
    }
}
