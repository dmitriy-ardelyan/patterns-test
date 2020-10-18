package com.dmitriy.test.patterns.startegy.implementations;

import com.dmitriy.test.patterns.startegy.interfaces.ICreditCardFormFillingStrategy;

public class CreditCardIdStrategy implements ICreditCardFormFillingStrategy {
    @Override
    public void fillCreditCardForm() {
        System.out.println("Filling Credit Card Form using ID strategy");
    }
}
