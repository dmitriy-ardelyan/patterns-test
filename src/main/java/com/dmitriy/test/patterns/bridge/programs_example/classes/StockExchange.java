package com.dmitriy.test.patterns.bridge.programs_example.classes;

import com.dmitriy.test.patterns.bridge.programs_example.interfaces.Developer;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange system is in progress");
        developer.writeCode();
    }
}
