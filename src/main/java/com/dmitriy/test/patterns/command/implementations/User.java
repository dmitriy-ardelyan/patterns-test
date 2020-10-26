package com.dmitriy.test.patterns.command.implementations;

import com.dmitriy.test.patterns.command.interfaces.Command;

public class User {
    Command startCommand;
    Command stopCommand;
    Command resetCommand;

    public void setStartCommand(Command startCommand) {
        this.startCommand = startCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void sendStartCommand() {
        startCommand.execute();
    }

    public void sendStopCommand() {
        stopCommand.execute();
    }

    public void sendResetCommand() {
        resetCommand.execute();
    }
}
