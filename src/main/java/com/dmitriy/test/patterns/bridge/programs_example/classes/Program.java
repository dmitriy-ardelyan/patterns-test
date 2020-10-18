package com.dmitriy.test.patterns.bridge.programs_example.classes;

import com.dmitriy.test.patterns.bridge.programs_example.interfaces.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer = developer;
    }
    public abstract void developProgram();
}
