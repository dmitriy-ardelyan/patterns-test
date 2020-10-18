package com.dmitriy.test.patterns.prototype.test;

import com.dmitriy.test.patterns.prototype.implementations.AccountClonesFactory;
import com.dmitriy.test.patterns.prototype.implementations.Buyer;
import com.dmitriy.test.patterns.prototype.implementations.Seller;
import com.dmitriy.test.patterns.prototype.interfaces.ICloneableUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeTest {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String accountType = null;
        System.out.println("Account type(Buyer/Seller) = ...");
        accountType = bufferedReader.readLine();

        ICloneableUser userAccount = null;
        if (accountType.equals("Buyer")) {
            userAccount = new Buyer("Olya", 27);
        } else if (accountType.equals("Seller")) {
            userAccount = new Seller("Alina", 33);
        } else {
            throw new RuntimeException("Invalid user type");
        }

        AccountClonesFactory accountClonesFactory = new AccountClonesFactory(userAccount);
        ICloneableUser iCloneableUser = accountClonesFactory.getCopy();
        System.out.println(iCloneableUser);
    }
}
