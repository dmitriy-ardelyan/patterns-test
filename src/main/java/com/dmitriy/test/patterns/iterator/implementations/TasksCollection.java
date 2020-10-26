package com.dmitriy.test.patterns.iterator.implementations;

import com.dmitriy.test.patterns.iterator.interfaces.Aggregator;
import com.dmitriy.test.patterns.iterator.interfaces.CustomIterator;

public class TasksCollection implements Aggregator {
    String[] tasks = {"Build da house", "Plant da tree", "Born da son"};

    private class TasksIterator implements CustomIterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object getObject() {
            return tasks[index++];
        }
    }

    @Override
    public CustomIterator getIterator() {
        return new TasksIterator();
    }
}
