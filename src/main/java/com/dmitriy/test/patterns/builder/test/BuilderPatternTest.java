package com.dmitriy.test.patterns.builder.test;

import com.dmitriy.test.patterns.builder.implementations.AccountBuilder;
import com.dmitriy.test.patterns.builder.implementations.UserAccount;

public class BuilderPatternTest {
    public static void main(String[] args) {
        AccountBuilder accountBuilder = new AccountBuilder();
        UserAccount account =
                accountBuilder
                        .create()
                        .setCountry("France")
                        .setLogin("opa@fake.com")
                        .setPassword("bugaga")
                        .build();

        account.provideCredentialsForTest();
    }
}
