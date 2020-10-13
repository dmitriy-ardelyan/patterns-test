package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.IBuyer;

public class FrenchBuyer implements IBuyer{
    public void buy() {
        System.out.println("French buyers buys!");
    }
}
