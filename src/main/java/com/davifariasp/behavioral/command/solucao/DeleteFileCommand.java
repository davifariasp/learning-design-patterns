package com.davifariasp.behavioral.command.solucao;

public class DeleteFileCommand implements Command{
    private final String fileName;

    public DeleteFileCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        System.out.println("Deleting file " + fileName);
    }
}
