package com.dmitriy.test.patterns.factory_method.implementations;

import com.dmitriy.test.patterns.factory_method.interfaces.IUser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsersFactory {
    public IUser getUser(String userClass) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class accountTypeClass = Class.forName(userClass);
        Constructor constructor = accountTypeClass.getConstructor();
        IUser testAccount = (IUser) constructor.newInstance();
        return testAccount;
    }
}
