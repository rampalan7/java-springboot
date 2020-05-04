package com.example.javaspringboot.data.model;

public class UserData {

    private String userFirstName;
    private String userEmail;
    private String userMiddleName;
    private String userLastName;

    public String getUserFirstName() {
        return userFirstName;
    }

    @Override
    public String toString() {
        return "UserDate{" +
                "userFirstName='" + userFirstName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userMiddleName='" + userMiddleName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                '}';
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMiddleName() {
        return userMiddleName;
    }

    public void setUserMiddleName(String userMiddleName) {
        this.userMiddleName = userMiddleName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}
