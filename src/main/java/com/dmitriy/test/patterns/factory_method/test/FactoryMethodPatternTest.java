package com.dmitriy.test.patterns.factory_method.test;

import com.dmitriy.test.patterns.factory_method.implementations.Buyer;
import com.dmitriy.test.patterns.factory_method.implementations.UsersFactory;
import com.dmitriy.test.patterns.factory_method.interfaces.IUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryMethodPatternTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String accountType = null;
        System.out.println("Account type(Admin/Buyer/Seller) = ...");
        accountType = bufferedReader.readLine();
        String fullClassPath = "com.dmitriy.test.patterns.factory_method.implementations." + accountType;

        UsersFactory testUserFactory = new UsersFactory();
        IUser testAccount = testUserFactory.getUser(fullClassPath);

        testAccount.login();
        testAccount.report();
    }
}
