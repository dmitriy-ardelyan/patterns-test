package com.dmitriy.test.patterns.chain_of_responsibility.interfaces;

import com.dmitriy.test.patterns.chain_of_responsibility.implementations.LoggerLevel;

import java.util.Objects;

public abstract class Logger {
    Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    LoggerLevel loggerLevel;

    public Logger(LoggerLevel loggerLevel) {
        this.loggerLevel = loggerLevel;
    }

    public void logMessage(String message, LoggerLevel loggerLevel) {
        if (this.loggerLevel.ordinal() <= loggerLevel.ordinal()) {
            writeMessage(message);
        }
        if (Objects.nonNull(nextLogger)){
            nextLogger.logMessage(message, loggerLevel);
        }
    }

    protected abstract void writeMessage(String message);
}
