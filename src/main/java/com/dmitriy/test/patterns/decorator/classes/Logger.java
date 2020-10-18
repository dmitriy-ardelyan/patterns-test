package com.dmitriy.test.patterns.decorator.classes;

import com.dmitriy.test.patterns.decorator.interfaces.ILogger;

public class Logger implements ILogger {
    @Override
    public void log(String info) {
        System.out.print(info);
    }
}
