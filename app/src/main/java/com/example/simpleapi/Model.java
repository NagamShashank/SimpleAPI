package com.example.simpleapi;

public class Model {

    private int UserID;
    private String Name,Position;

    public Model(int userID, String name, String position) {
        UserID = userID;
        Name = name;
        Position = position;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
