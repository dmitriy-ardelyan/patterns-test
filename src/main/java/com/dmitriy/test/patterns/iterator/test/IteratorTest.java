package com.dmitriy.test.patterns.iterator.test;

import com.dmitriy.test.patterns.iterator.implementations.TasksCollection;
import com.dmitriy.test.patterns.iterator.interfaces.CustomIterator;

public class IteratorTest {
    public static void main(String[] args) {
        TasksCollection tasksCollection = new TasksCollection();
        CustomIterator customIterator = tasksCollection.getIterator();
        while (customIterator.hasNext()) {
            System.out.println((String) customIterator.getObject());
        }
    }
}
