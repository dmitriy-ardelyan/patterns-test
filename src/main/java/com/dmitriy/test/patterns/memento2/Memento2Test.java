package com.dmitriy.test.patterns.memento2;

public class Memento2Test {
    public static void main(String[] args) {
        User user = new User("Dima",33);
        UsersStorage usersStorage = new UsersStorage();
        usersStorage.setUserState(user.getUserState());
        System.out.println(user);
        user.setAge(34);
        System.out.println(user);

        user.setUserState(usersStorage.getUserState());
        System.out.println(user);
    }

}
