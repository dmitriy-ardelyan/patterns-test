package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.IBuyer;

public class NetherlandsBuyer implements IBuyer {
    public void buy() {
        System.out.println("Netherlands Buyer buys!");
    }
}
