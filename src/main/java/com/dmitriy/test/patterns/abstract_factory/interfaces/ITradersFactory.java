package com.dmitriy.test.patterns.abstract_factory.interfaces;

public interface ITradersFactory {

    IAdmin getAdmin();
    ISeller getSeller();
    IBuyer getBuyer();

}
