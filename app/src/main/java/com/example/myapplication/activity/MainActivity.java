package com.example.myapplication.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.PostAdapter;
import com.example.myapplication.adapter.StoryAdapter;
import com.example.myapplication.model.Post;
import com.example.myapplication.model.Story;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerStories;
    private RecyclerView recyclerPost;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        showStory();
        showPost();
    }


    void showPost() {
        recyclerPost = findViewById(R.id.recyclerPost);
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/1.webp", "https://www.gstatic.com/webp/gallery/1.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/2.webp", "https://www.gstatic.com/webp/gallery/2.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/3.webp", "https://www.gstatic.com/webp/gallery/3.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/4.webp", "https://www.gstatic.com/webp/gallery/4.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/5.webp", "https://www.gstatic.com/webp/gallery/5.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/1.webp", "https://www.gstatic.com/webp/gallery/1.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/2.webp", "https://www.gstatic.com/webp/gallery/2.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/3.webp", "https://www.gstatic.com/webp/gallery/3.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/4.webp", "https://www.gstatic.com/webp/gallery/4.webp", "New"));
        posts.add(new Post("Ali", "https://www.gstatic.com/webp/gallery/5.webp", "https://www.gstatic.com/webp/gallery/5.webp", "New"));

        PostAdapter adapter = new PostAdapter(posts);
        recyclerPost.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        recyclerPost.setLayoutManager(layoutManager);




    }

    void showStory() {
        recyclerStories = findViewById(R.id.recyclerStories);
//        data
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("Your Story", "https://img.icons8.com/ios/344/add.png"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/ir.divar_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));

        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/ir.divar_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));

        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/ir.divar_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/com.mobiliha.badesaba_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));
        stories.add(new Story("Moin", "https://cafe.bzrcdn.net/1/icons/cab.snapp.passenger_128x128.png?x-img=v1/resize,h_105,w_105/format,type_webp"));


//        Adapter
        StoryAdapter storyAdapter = new StoryAdapter(stories);
        recyclerStories.setAdapter(storyAdapter);
//        Set layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false);
        recyclerStories.setLayoutManager(layoutManager);
    }

}