package com.dmitriy.test.patterns.command.implementations;

public class Computer {
    public void start() {
        System.out.println("Computer started");
    }

    public void stop() {
        System.out.println("Computer stopped");
    }

    public void reset() {
        System.out.println("Computer reset is in progress");
    }
}
