package com.dmitriy.test.patterns.composite.test;

import com.dmitriy.test.patterns.composite.implementations.Squad;
import com.dmitriy.test.patterns.composite.implementations.Worker;

public class CompositeTest {
    public static void main(String[] args) {
        System.out.println("Company starts people assignment to squads");

        Worker ivan = new Worker("Ivan");
        Worker pavel = new Worker("Pavel");
        Worker katya = new Worker("Katya");
        Worker nastya = new Worker("Nastya");
        Worker fedya = new Worker("Fedya");

        Squad offStreet = new Squad("Offstreet squad");
        offStreet.addWorkResource(ivan);
        offStreet.addWorkResource(pavel);

        Squad onStreet = new Squad("OnStreet squad");
        onStreet.addWorkResource(katya);
        onStreet.addWorkResource(nastya);

        Squad bookingOffStreetAndOnStreet = new Squad("Booking offstreet and on street");
        bookingOffStreetAndOnStreet.addWorkResource(fedya);
        bookingOffStreetAndOnStreet.addWorkResource(offStreet);
        bookingOffStreetAndOnStreet.addWorkResource(onStreet);

        System.out.println("Company starts working");
        bookingOffStreetAndOnStreet.work();
    }
}
