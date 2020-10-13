package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.IAdmin;
import com.dmitriy.test.patterns.abstract_factory.interfaces.IBuyer;
import com.dmitriy.test.patterns.abstract_factory.interfaces.ISeller;
import com.dmitriy.test.patterns.abstract_factory.interfaces.ITradersFactory;

public class FrenchTradersFactory implements ITradersFactory {
    public IAdmin getAdmin() {
        return new FrenchAdmin();
    }

    public ISeller getSeller() {
        return new FrenchSeller();
    }

    public IBuyer getBuyer() {
        return new FrenchBuyer();
    }
}
