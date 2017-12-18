package io.zipcode.loganhanner.messageservicev2.domain;

public class User {

    String userName;

    User() {}

    public User(long userName) {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
