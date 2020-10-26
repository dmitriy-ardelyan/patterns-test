package com.dmitriy.test.patterns.command.implementations;

import com.dmitriy.test.patterns.command.interfaces.Command;

public class ResetCommand implements Command {
    Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
