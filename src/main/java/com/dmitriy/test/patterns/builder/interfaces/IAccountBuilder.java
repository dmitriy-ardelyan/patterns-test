package com.dmitriy.test.patterns.builder.interfaces;

import com.dmitriy.test.patterns.builder.implementations.UserAccount;

public interface IAccountBuilder {

    IAccountBuilder create();
    IAccountBuilder setCountry(String country);
    IAccountBuilder setLogin(String login);
    IAccountBuilder setPassword(String password);

    UserAccount build();
}
