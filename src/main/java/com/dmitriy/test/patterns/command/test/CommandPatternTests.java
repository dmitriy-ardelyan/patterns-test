package com.dmitriy.test.patterns.command.test;

import com.dmitriy.test.patterns.command.implementations.*;

public class CommandPatternTests {
    public static void main(String[] args) {

        User user = new User();
        Computer computer = new Computer();

        StartCommand startCommand = new StartCommand(computer);
        StopCommand stopCommand = new StopCommand(computer);
        ResetCommand resetCommand = new ResetCommand(computer);

        user.setStartCommand(startCommand);
        user.setStopCommand(stopCommand);
        user.setResetCommand(resetCommand);

        user.sendStartCommand();
        user.sendStopCommand();
        user.sendResetCommand();
    }
}
