package com.example.myapplication.model;

public class Post {
    private String userName;
    private String userImage;
    private String imgComment;
    private String postImage;
    private String content;
    private boolean like;

    public Post(String userName, String userImage, String postImage, String content, boolean like) {
        this.userName = userName;
        this.userImage = userImage;
        this.postImage = postImage;
        this.imgComment= imgComment;
        this.content = content;
        this.like = like;
    }

    public String getImgComment() {
        return imgComment;
    }

    public void setImgComment(String imgComment) {
        this.imgComment = imgComment;
    }

    public Post(String imgComment) {
        this.imgComment = imgComment;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
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
