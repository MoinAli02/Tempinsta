package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Story;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.Holder> {
    ArrayList<Story> storyAdapters;

    public StoryAdapter(ArrayList<Story> storyAdapters) {
        this.storyAdapters = storyAdapters;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.testadopter, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.Holder holder, int position) {
        Story story = storyAdapters.get(position);

        holder.txtName.setText(story.getName());

        Picasso.get()
                .load(story.getUserImage())
                .into(holder.userImage);

    }

    @Override
    public int getItemCount() {
        return storyAdapters.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView userImage;
        TextView txtName;

        public Holder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.userImage);
            txtName =itemView.findViewById(R.id.txtName);
        }
    }
}

