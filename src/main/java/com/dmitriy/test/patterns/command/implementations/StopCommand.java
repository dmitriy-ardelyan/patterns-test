package com.dmitriy.test.patterns.command.implementations;

import com.dmitriy.test.patterns.command.interfaces.Command;

public class StopCommand implements Command {
    Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
