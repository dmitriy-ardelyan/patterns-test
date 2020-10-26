package com.dmitriy.test.patterns.observer.interfaces;

public interface ObservedObject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
