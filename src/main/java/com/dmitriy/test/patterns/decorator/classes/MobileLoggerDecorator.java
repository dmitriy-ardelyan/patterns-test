package com.dmitriy.test.patterns.decorator.classes;

import com.dmitriy.test.patterns.decorator.interfaces.ILogger;

public class MobileLoggerDecorator  implements ILogger{
    private ILogger defaultLogger;

    public MobileLoggerDecorator(ILogger defaultLogger) {
        this.defaultLogger = defaultLogger;
    }

    public void log(String info){
        System.out.println("Test Device : Samsung Galaxy 2 Android 8.0: " + info);
    }
}
