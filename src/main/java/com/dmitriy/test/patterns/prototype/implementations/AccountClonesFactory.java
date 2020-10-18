package com.dmitriy.test.patterns.prototype.implementations;

import com.dmitriy.test.patterns.prototype.interfaces.ICloneableUser;

public class AccountClonesFactory {
    private ICloneableUser blueprint;

    public AccountClonesFactory(ICloneableUser blueprint) {
        this.blueprint = blueprint;
    }

    public ICloneableUser getCopy() {
        return blueprint.makeCopy();
    }
}
