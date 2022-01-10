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
import com.example.myapplication.activity.PostImageActivity;
import com.example.myapplication.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

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
                final Intent intent = new Intent(context, PostImageActivity.class);
                intent.putExtra("image", post.getPostImage());
                intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


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

        holder.imgComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostImageActivity.class);
                intent.putExtra("image", post.getImgComment());
                intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.imgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                shareIntent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(shareIntent);
            }
        });
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

        ImageView imageIcon, postImage, imgLike, imgShare, imgComment, postImage1;
        TextView txtPostname;

        public Holder(@NonNull View itemView) {
            super(itemView);

            imageIcon = itemView.findViewById(R.id.imageIcon);
            imgComment = itemView.findViewById(R.id.imgComment);
            postImage = itemView.findViewById(R.id.postImage);
            imgLike = itemView.findViewById(R.id.imgLike);
            imgShare = itemView.findViewById(R.id.imgShare);
            txtPostname = itemView.findViewById(R.id.txtPostname);
            postImage1 = itemView.findViewById(R.id.postImage1);
        }
    }


}
