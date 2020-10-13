package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.IAdmin;

public class NetherlandsAdmin implements IAdmin {
    public void approve() {
        System.out.println("Netherlands admin approves!");
    }
}
