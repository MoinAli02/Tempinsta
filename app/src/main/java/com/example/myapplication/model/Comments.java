package com.example.myapplication.model;

public class Comments {


    private String commentName;
    private String commentText;
    private String commentTime;
    private String commentLikes;
    private String commentReply;
    private String commentImage;
    private boolean commentLike;

    public Comments(String commentName, String commentText, String commentTime, String commentLikes, String commentReply, String commentImage, boolean commentLike) {
        this.commentName = commentName;
        this.commentText = commentText;
        this.commentTime = commentTime;
        this.commentLikes = commentLikes;
        this.commentReply = commentReply;
        this.commentImage = commentImage;
        this.commentLike = commentLike;
    }


    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentLikes() {
        return commentLikes;
    }

    public void setCommentLikes(String commentLikes) {
        this.commentLikes = commentLikes;
    }

    public String getCommentReply() {
        return commentReply;
    }

    public void setCommentReply(String commentReply) {
        this.commentReply = commentReply;
    }

    public String getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(String commentImage) {
        this.commentImage = commentImage;
    }

    public boolean isCommentLike() {
        return commentLike;
    }

    public void setCommentLike(boolean commentLike) {
        this.commentLike = commentLike;
    }
}
