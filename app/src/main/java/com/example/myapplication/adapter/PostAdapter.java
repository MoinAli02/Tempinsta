package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Post;
import com.example.myapplication.model.Story;
import com.google.android.material.transition.Hold;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.Holder> {
    ArrayList<Post> posts;

    public PostAdapter(ArrayList<Post> postAdapters) {
        this.posts = postAdapters;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.testpostadapter, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Post post = posts.get(position);

        holder.txtPostname.setText(post.getUserName());


        Picasso.get()
                .load(post.getPostImage())
                .into(holder.postImage);
        Picasso.get()
                .load(post.getPostImage())
                .into(holder.imageIcon);
    }


    @Override
    public int getItemCount() {
        return posts.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView imageIcon, postImage, imgLike, imgShare;
        TextView txtPostname;

        public Holder(@NonNull View itemView) {
            super(itemView);

            imageIcon = itemView.findViewById(R.id.imageIcon);
            postImage = itemView.findViewById(R.id.postImage);
            imgLike = itemView.findViewById(R.id.imgLike);
            imgShare = itemView.findViewById(R.id.imgShare);
            txtPostname = itemView.findViewById(R.id.txtPostname);
        }
    }

//        Boolean clicked = true;
////ImageView.setOnClickListener(new View visetOnClickListner() {
////        @Override
////        public void onClick(View ) {
////            if (clicked) {
////                clicked = false;
////                ImageView.setImageResource(R.drawable.ic_baseline_favorite_24);
////            } else {
////                clicked = true;
////                ImageView.setImageResource(R.drawable.ic_dislike_24);
////            }
////        }
//////    Boolean clicked = true;
//////    ImageView.setOnCl
}
