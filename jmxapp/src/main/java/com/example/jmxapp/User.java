package com.example.jmxapp;

public class User implements UserMBean {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Long id;
    private String userName;
    private String password;

    @Override
    public void printUserInfo() {
        System.out.println("This is user with username: " + userName);
    }

    // standard getters and setters without setId() setter
}
