package com.dmitriy.test.patterns.startegy.implementations;

import com.dmitriy.test.patterns.startegy.interfaces.ICreditCardFormFillingStrategy;

public class CreditCartCDeskStrategy implements ICreditCardFormFillingStrategy {
    @Override
    public void fillCreditCardForm() {
        System.out.println("Filling Credit Card form using CDesk locators");
    }
}
