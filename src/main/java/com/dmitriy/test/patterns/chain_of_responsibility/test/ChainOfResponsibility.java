package com.dmitriy.test.patterns.chain_of_responsibility.test;

import com.dmitriy.test.patterns.chain_of_responsibility.implementations.DebugFileLogger;
import com.dmitriy.test.patterns.chain_of_responsibility.implementations.EmailLogger;
import com.dmitriy.test.patterns.chain_of_responsibility.implementations.LoggerLevel;
import com.dmitriy.test.patterns.chain_of_responsibility.implementations.SMSLogger;
import com.dmitriy.test.patterns.chain_of_responsibility.interfaces.Logger;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(LoggerLevel.ERROR);
        Logger debugFileLogger = new DebugFileLogger(LoggerLevel.DEBUG);
        Logger emailLogger = new EmailLogger(LoggerLevel.INFO);

        smsLogger.setNextLogger(debugFileLogger);
        debugFileLogger.setNextLogger(emailLogger);

        smsLogger.logMessage("Everything is ok", LoggerLevel.INFO);
        smsLogger.logMessage("Debug information is here", LoggerLevel.DEBUG);
        smsLogger.logMessage("System is down!!! Error! Error.. Error!!!", LoggerLevel.ERROR);

    }
}
