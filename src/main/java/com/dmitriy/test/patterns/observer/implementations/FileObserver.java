package com.dmitriy.test.patterns.observer.implementations;

import com.dmitriy.test.patterns.observer.interfaces.Observer;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(double temperature, int pressure) {
        System.out.println("Meteo state is changed\t ADD FILE LOG: temp = " + temperature + " pressure = " + pressure);
    }
}
