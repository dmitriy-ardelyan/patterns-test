package com.dmitriy.test.patterns.abstract_factory.implementations;

import com.dmitriy.test.patterns.abstract_factory.interfaces.IAdmin;
import com.dmitriy.test.patterns.abstract_factory.interfaces.IBuyer;
import com.dmitriy.test.patterns.abstract_factory.interfaces.ISeller;
import com.dmitriy.test.patterns.abstract_factory.interfaces.ITradersFactory;

public class NetherlandsTraderFactory implements ITradersFactory {
    public IAdmin getAdmin() {
        return new NetherlandsAdmin();
    }

    public ISeller getSeller() {
        return new NetherlandsSeller();
    }

    public IBuyer getBuyer() {
        return new NetherlandsBuyer();
    }
}
