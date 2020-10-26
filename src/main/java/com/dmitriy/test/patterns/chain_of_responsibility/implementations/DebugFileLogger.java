package com.dmitriy.test.patterns.chain_of_responsibility.implementations;

import com.dmitriy.test.patterns.chain_of_responsibility.interfaces.Logger;

public class DebugFileLogger extends Logger {
    public DebugFileLogger(LoggerLevel loggerLevel) {
        super(loggerLevel);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Debug File: " + message);
    }
}
