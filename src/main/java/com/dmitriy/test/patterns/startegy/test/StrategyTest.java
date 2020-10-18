package com.dmitriy.test.patterns.startegy.test;

import com.dmitriy.test.patterns.startegy.implementations.CreditCardIdStrategy;
import com.dmitriy.test.patterns.startegy.implementations.CreditCartCDeskStrategy;
import com.dmitriy.test.patterns.startegy.interfaces.ICreditCardFormFillingStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyTest {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String receivedLocatorType = null;
        System.out.println("Locator type(CDesk/ID) = ...");
        receivedLocatorType = bufferedReader.readLine();

        ICreditCardFormFillingStrategy creditCardFormFillingStrategy = null;
        if (receivedLocatorType.equals("ID")) {
            creditCardFormFillingStrategy = new CreditCardIdStrategy();
        } else {
            creditCardFormFillingStrategy = new CreditCartCDeskStrategy();
        }
        creditCardFormFillingStrategy.fillCreditCardForm();
    }
}
