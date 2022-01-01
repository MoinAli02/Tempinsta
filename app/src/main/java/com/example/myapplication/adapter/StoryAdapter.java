package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.Holder> {
    ArrayList<StoryAdapter> userImageAdapters;

    public StoryAdapter(ArrayList<StoryAdapter> storyAdapters) {
        this.userImageAdapters = userImageAdapters;
    }

    public StoryAdapter(int fireworks) {
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
        StoryAdapter userImageAdapter = userImageAdapters.get(position);
        holder.userimage.setImageResource((int) userImageAdapter.getItemId(R.id.userimage));

        Picasso.get()
                .load("https://images.app.goo.gl/A8BhAfnbMiLDYpep6")
                .into();
        Picasso.get().load("").into();

    }

    @Override
    public int getItemCount() {
        return userImageAdapters.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView userimage;
        TextView txtName;

        public Holder(@NonNull View itemView) {
            super(itemView);
            userimage = itemView.findViewById(R.id.userimage);
            txtName =itemView.findViewById(R.id.txtName);
        }
    }
}

