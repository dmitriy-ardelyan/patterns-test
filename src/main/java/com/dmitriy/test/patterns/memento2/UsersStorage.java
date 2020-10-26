package com.dmitriy.test.patterns.memento2;

public class UsersStorage {
    private UserState userState;

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }
}
