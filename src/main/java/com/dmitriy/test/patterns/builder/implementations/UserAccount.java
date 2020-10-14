package com.dmitriy.test.patterns.builder.implementations;

public class UserAccount {
    private String country;
    private String login;
    private String password;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void provideCredentialsForTest() {
        System.out.println(country + " " + login + " " + password);
    }
}
