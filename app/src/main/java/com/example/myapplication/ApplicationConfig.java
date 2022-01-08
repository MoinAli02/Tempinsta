package com.example.myapplication;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

public class ApplicationConfig extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
