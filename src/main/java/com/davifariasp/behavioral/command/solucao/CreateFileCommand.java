package com.davifariasp.behavioral.command.solucao;

public class CreateFileCommand implements Command{
    private final String fileName;

    public CreateFileCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        System.out.println("Creating file " + fileName);
    }
}
