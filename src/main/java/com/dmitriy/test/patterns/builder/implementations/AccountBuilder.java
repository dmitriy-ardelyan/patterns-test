package com.dmitriy.test.patterns.builder.implementations;

import com.dmitriy.test.patterns.builder.interfaces.IAccountBuilder;

public class AccountBuilder implements IAccountBuilder {

    private UserAccount userAccount;

    @Override
    public IAccountBuilder create() {
        userAccount = new UserAccount();
        return this;
    }

    @Override
    public IAccountBuilder setCountry(String country) {
        userAccount.setCountry(country);
        return this;
    }

    @Override
    public IAccountBuilder setLogin(String login) {
        userAccount.setLogin(login);
        return this;
    }

    @Override
    public IAccountBuilder setPassword(String password) {
        userAccount.setPassword(password);
        return this;
    }

    @Override
    public UserAccount build() {
        return userAccount;
    }
}
