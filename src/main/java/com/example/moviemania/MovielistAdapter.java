package com.example.moviemania;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovielistAdapter extends RecyclerView.Adapter<MovielistAdapter.MyViewHolder>{

    Context context;
    List<MovieList> movieData;

    public MovielistAdapter(Context context, List<MovieList> movieData) {
        this.context = context;
        this.movieData = movieData;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.movie_item_list,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.movieTitle.setText(movieData.get(position).getTitle());
        holder.movieImage.setImageResource(movieData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return movieData.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView movieTitle;
        private ImageView movieImage;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            movieTitle=itemView.findViewById(R.id.movie_title);
            movieImage=itemView.findViewById(R.id.movielist_imageView);

        }
    }
}
