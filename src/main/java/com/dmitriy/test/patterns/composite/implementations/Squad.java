package com.dmitriy.test.patterns.composite.implementations;

import com.dmitriy.test.patterns.composite.interfaces.IWorkable;

import java.util.ArrayList;
import java.util.List;

public class Squad implements IWorkable {
    private String name;

    List<IWorkable> resources = new ArrayList<>();

    public void addWorkResource(IWorkable workResource) {
        resources.add(workResource);
    }

    public void deleteWorkResource(IWorkable workResource) {
        resources.remove(workResource);
    }

    public Squad(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " squad is working: ");
        for (IWorkable workResource : resources) {
            workResource.work();
        }
    }
}
