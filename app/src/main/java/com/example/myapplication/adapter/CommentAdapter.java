package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Comments;
import com.example.myapplication.model.Post;

import org.w3c.dom.Comment;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.Holder> {
    ArrayList<Comment> comments;
    Context context;
    public CommentAdapter(ArrayList<Comment> commentAdapters, Context context) {
        this.comments = commentAdapters;
        this.context = context;

    }



//    public CommentAdapter(ArrayList<Comments> comments) {
//
//    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postcomments, parent, false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder,final int position) {
        final Comment comment = comments.get(position);
        holder.commentText.setText(comment.getTextContent());

    }

    @Override
    public int getItemCount() { return comments.size(); }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView commentImage, commentLike ;
        TextView commentName, commentText, commentTime, commentLikes, commentReply;


        public Holder(@NonNull View itemView) {
            super(itemView);
            commentImage =itemView.findViewById(R.id.commentImage);
            commentLike =itemView.findViewById(R.id.commentLike);
            commentName =itemView.findViewById(R.id.commentName);
            commentText =itemView.findViewById(R.id.commentText);
            commentTime =itemView.findViewById(R.id.commentTime);
            commentLikes =itemView.findViewById(R.id.commentLikes);
            commentReply =itemView.findViewById(R.id.commentReply);



        }
    }
}



