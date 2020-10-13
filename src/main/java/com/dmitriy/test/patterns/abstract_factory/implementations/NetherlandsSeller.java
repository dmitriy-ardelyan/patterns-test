package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.ISeller;

public class NetherlandsSeller implements ISeller {
    public void sell() {
        System.out.println("Netherlands seller sells!");
    }
}
