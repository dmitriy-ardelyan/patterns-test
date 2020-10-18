package com.dmitriy.test.patterns.bridge.programs_example.classes;

import com.dmitriy.test.patterns.bridge.programs_example.interfaces.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code");
    }
}
