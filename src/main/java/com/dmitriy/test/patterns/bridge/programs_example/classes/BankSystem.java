package com.dmitriy.test.patterns.bridge.programs_example.classes;

import com.dmitriy.test.patterns.bridge.programs_example.interfaces.Developer;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress");
        developer.writeCode();
    }
}
