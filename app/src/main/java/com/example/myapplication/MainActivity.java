package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.adapter.StoryAdapter;
import com.example.myapplication.model.Story;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    //    int takepic = 1;
    private RecyclerView recyclerStories;
//    private FloatingActionButton takepic;
//    private ImageView userimage, sendmsg;
//    private TextView txtsearch, editProfile;

//    private BottomNavigationView bottomNavigationView;
//    private CircleImageView imgProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        takepic = findViewById(R.id.takepic);
//        userimage = findViewById(R.id.userimage);

        recyclerStories = findViewById(R.id.recyclerStories);
//        data
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/ir.divar_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/ir.divar_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));

        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/ir.divar_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));

        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/ir.divar_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Amir", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));

//        Adapter
        StoryAdapter storyAdapter = new StoryAdapter(stories);
        recyclerStories.setAdapter(storyAdapter);
//        Set layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false);
        recyclerStories.setLayoutManager(layoutManager);
    }


//    private void takePicture() {
//        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(cameraIntent, takepic);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == takepic && resultCode == RESULT_OK) {
//            Bundle bundle = data.getExtras();
//            Bitmap image = (Bitmap) bundle.get("data");
//            takepic.setImageBitmap(image);
//        }
//
//    }
}