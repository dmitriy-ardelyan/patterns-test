package com.dmitriy.test.patterns.prototype.implementations;

import com.dmitriy.test.patterns.prototype.interfaces.ICloneableUser;

public class Seller implements ICloneableUser {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seller(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public ICloneableUser makeCopy() {
        return new Seller(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
