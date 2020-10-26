package com.dmitriy.test.patterns.command.implementations;

import com.dmitriy.test.patterns.command.interfaces.Command;

public class StartCommand implements Command {
    Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
