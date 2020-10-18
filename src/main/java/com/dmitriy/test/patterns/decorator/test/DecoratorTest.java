package com.dmitriy.test.patterns.decorator.test;

import com.dmitriy.test.patterns.decorator.classes.Logger;
import com.dmitriy.test.patterns.decorator.classes.MobileLoggerDecorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Logger defaultTestLogger = new Logger();
        defaultTestLogger.log("We are running default test\n");

        MobileLoggerDecorator mobileLoggerDecorator = new MobileLoggerDecorator(defaultTestLogger);
        mobileLoggerDecorator.log(" We are running mobiel test");
    }
}
