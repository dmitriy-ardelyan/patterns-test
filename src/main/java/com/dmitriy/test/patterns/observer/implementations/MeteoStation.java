package com.dmitriy.test.patterns.observer.implementations;

import com.dmitriy.test.patterns.observer.interfaces.ObservedObject;
import com.dmitriy.test.patterns.observer.interfaces.Observer;

import java.util.ArrayList;

public class MeteoStation implements ObservedObject {

    private double temperature;
    private int pressure;
    private ArrayList<Observer> observersList = new ArrayList<>();

    public void setTemperature(double temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList) {
            observer.handleEvent(temperature, pressure);
        }
    }
}
