package com.example.myapplication.model;

import androidx.annotation.NonNull;

public class Story  {
    private String txtName;
    private int userimage;

    public Story(String txtName, int userimage) {
        this.txtName = txtName;
        this.userimage = userimage;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getUserimage() {
        return userimage;
    }

    public void setUserimage(int userimage) {
        this.userimage = userimage;
    }

    public Story(String txtName, int userimage){
        this.title = title;
        this.price = price;
        this.imageId = imageId;
    }

}
