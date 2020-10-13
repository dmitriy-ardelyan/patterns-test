package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.IAdmin;

public class FrenchAdmin implements IAdmin {
    public void approve() {
        System.out.println("French admin approves!");
    }
}
