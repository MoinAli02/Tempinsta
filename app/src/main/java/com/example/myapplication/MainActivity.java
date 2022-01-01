package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.adapter.StoryAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    int takepic = 1;
    private FloatingActionButton takepic;
    private ImageView userimage, sendmsg;
    private TextView txtsearch, editProfile;
    private RecyclerView horizontalrecycler;
    private BottomNavigationView bottomNavigationView;
    private CircleImageView imgProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        takepic = findViewById(R.id.takepic);
        userimage = findViewById(R.id.userimage);

        ArrayList<StoryAdapter> storyAdapters = new StoryAdapter();
        for (int i = 0; i < 20; i++) {
            StoryAdapter storyAdapter = new StoryAdapter(R.drawable.fireworks);
        }
        StoryAdapter adapter = new StoryAdapter();
    }


    private void takePicture() {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, takepic);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == takepic && resultCode == RESULT_OK) {
            Bundle bundle = data.getExtras();
            Bitmap image = (Bitmap) bundle.get("data");
            takepic.setImageBitmap(image);
        }

    }
}