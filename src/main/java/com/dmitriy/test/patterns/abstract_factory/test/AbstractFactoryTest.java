package com.dmitriy.test.patterns.abstract_factory.test;

import com.dmitriy.test.patterns.abstract_factory.implementations.FrenchTradersFactory;
import com.dmitriy.test.patterns.abstract_factory.implementations.NetherlandsTraderFactory;
import com.dmitriy.test.patterns.abstract_factory.interfaces.ITradersFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryTest {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String countryParameter = null;

        System.out.println("Country = ...");
        countryParameter = bufferedReader.readLine();
        ITradersFactory tradersFactory = null;

        if(countryParameter.equals("FR")) {
            tradersFactory = new FrenchTradersFactory();
        } else if (countryParameter.equals("NL")) {
            tradersFactory = new NetherlandsTraderFactory();
        }

        System.out.println("Do test: \n");
        tradersFactory.getSeller().sell();
        tradersFactory.getBuyer().buy();
        tradersFactory.getAdmin().approve();


    }
}
