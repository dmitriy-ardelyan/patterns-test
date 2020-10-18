package com.dmitriy.test.patterns.bridge.programs_example.test;

import com.dmitriy.test.patterns.bridge.programs_example.classes.*;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new StockExchange(new JavaDeveloper()),
                new BankSystem(new CppDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
        }
    }
}
