package com.davifariasp.behavioral.command.solucao;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
        commands.clear();
    }
}
