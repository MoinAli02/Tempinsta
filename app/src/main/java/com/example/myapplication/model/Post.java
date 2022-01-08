package com.example.myapplication.model;

public class Post {
    private String userName;
    private String userImage;
    private String postImage;
    private String content;

    public Post(String userName, String userImage, String postImage, String content) {
        this.userName = userName;
        this.userImage = userImage;
        this.postImage = postImage;
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
