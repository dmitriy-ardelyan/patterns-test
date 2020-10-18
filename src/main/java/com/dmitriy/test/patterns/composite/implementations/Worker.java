package com.dmitriy.test.patterns.composite.implementations;

import com.dmitriy.test.patterns.composite.interfaces.IWorkable;

public class Worker implements IWorkable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is working");
    }
}
