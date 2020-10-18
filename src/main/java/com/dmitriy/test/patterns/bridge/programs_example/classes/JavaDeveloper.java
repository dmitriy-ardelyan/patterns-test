package com.dmitriy.test.patterns.bridge.programs_example.classes;

import com.dmitriy.test.patterns.bridge.programs_example.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
