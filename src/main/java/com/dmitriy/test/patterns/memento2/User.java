package com.dmitriy.test.patterns.memento2;

public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public UserState getUserState() {
        return new UserState(name, age);
    }

    public void setUserState(UserState userState) {
        this.name = userState.getName();
        this.age = userState.getAge();
    }
}
