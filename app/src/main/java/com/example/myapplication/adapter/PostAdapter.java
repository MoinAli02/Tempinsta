package com.example.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.activity.Comments_Activity;
import com.example.myapplication.activity.MainActivity;
import com.example.myapplication.activity.PostimageActivity;
import com.example.myapplication.activity.ProfileActivity;
import com.example.myapplication.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.Holder> {
    ArrayList<Post> posts;
    Context context;

    public PostAdapter(ArrayList<Post> postAdapters, Context context) {
        this.posts = postAdapters;
        this.context = context;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.testpostadapter, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int position) {
        final Post post = posts.get(position);

        holder.txtPostname.setText(post.getUserName());

        holder.postImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(context, PostimageActivity.class);
                intent.putExtra("image", post.getPostImage());
                context.startActivity(intent);

                holder.imgComment.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1=new Intent(context, Comments_Activity.class);
                        intent.putExtra("image", post.getImgComment());
                        context.startActivity(intent1);
                    }
                }) ;

            }
        });
        holder.imgLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (post.isLike()) {
                    post.setLike(false);

                    holder.imgLike.setImageResource(R.drawable.ic_dislike_24);
                } else {
                    post.setLike(true);
                    holder.imgLike.setImageResource(R.drawable.ic_baseline_favorite_24);
                }
// Update post list after every change
                posts.set(position, post);
            }


        });

        Picasso.get()
                .load(post.getPostImage())
                .into(holder.postImage);
        Picasso.get()
                .load(post.getPostImage())
                .into(holder.imageIcon);
//        Picasso.get()
//                .load(post.getPostImage())
//                .into(holder.postImage1);
    }


    @Override
    public int getItemCount() {
        return posts.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView imageIcon, postImage, imgLike, imgShare, imgComment,postImage1;
        TextView txtPostname;

        public Holder(@NonNull View itemView) {
            super(itemView);

            imageIcon = itemView.findViewById(R.id.imageIcon);
            imgComment = itemView.findViewById(R.id.imgComment);
            postImage = itemView.findViewById(R.id.postImage);
            imgLike = itemView.findViewById(R.id.imgLike);
            imgShare = itemView.findViewById(R.id.imgShare);
            txtPostname = itemView.findViewById(R.id.txtPostname);
            postImage1= itemView.findViewById(R.id.postImage1);
        }
    }


}
