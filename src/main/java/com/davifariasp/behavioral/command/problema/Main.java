package com.davifariasp.behavioral.command.problema;

public class Main {
    public static void main(String[] args) {
        var handler = new FileOperationHandler();

        handler.createFile("file1.txt");
        handler.deleteFile("file1.txt");
    }
}
