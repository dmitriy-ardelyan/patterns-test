package com.dmitriy.test.patterns.factory_method.interfaces;

public interface IUser {

    default void login() {
        System.out.println(this.getClass().getSimpleName() + " logged in");
    }

    default void report() {
        System.out.println(this.getClass().getSimpleName() + " reports");
    }
}
