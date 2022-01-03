package com.example.myapplication.model;

public class Story {
    private String name;
    private String userImage;

    public Story(String _name, String _image) {
        this.name = _name;
        this.userImage = _image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }
}
