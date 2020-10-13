package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.ISeller;

public class FrenchSeller implements ISeller {
    public void sell() {
        System.out.println("French Seller sells");
    }
}
