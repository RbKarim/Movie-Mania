package com.example.moviemania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {


    RecyclerView PopularmoviesListRV;
    RecyclerView BanglamoviesListRV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //recycler view of popular moives list
        PopularmoviesListRV=findViewById(R.id.recycleView_movielist);


        //initializing popular movie list data

        List<MovieList> popularMovies= new ArrayList<>();
        popularMovies.add(new MovieList("Dark",R.drawable.dark));
        popularMovies.add(new MovieList("Hostel Daze",R.drawable.hosteldaze));
        popularMovies.add(new MovieList("Spider Man",R.drawable.spider));
        popularMovies.add(new MovieList("Shershaah",R.drawable.shershah));
        popularMovies.add(new MovieList("Witcher",R.drawable.witcher));

        MovielistAdapter PopularmovielistAdapter=new MovielistAdapter(this,popularMovies);
        PopularmoviesListRV.setAdapter(PopularmovielistAdapter);
        PopularmoviesListRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        //recycler view of bangla moives list
        BanglamoviesListRV=findViewById(R.id.banglamovieList_RV);


        //initializing bangla movie list data

        List<MovieList> banglaMovies= new ArrayList<>();
        banglaMovies.add(new MovieList("Baishe Srabon",R.drawable.baishesrabon));
        banglaMovies.add(new MovieList("Daruchini Dip",R.drawable.daruchinidip));
        banglaMovies.add(new MovieList("Nondito Noroke",R.drawable.nonditonoroke));
        banglaMovies.add(new MovieList("Matir Moyna",R.drawable.matirmoyna));
        banglaMovies.add(new MovieList("Amar Bondhu Rashed",R.drawable.amarbonshurashed));

        MovielistAdapter BanglamovielistAdapter=new MovielistAdapter(this,banglaMovies);
        BanglamoviesListRV.setAdapter(BanglamovielistAdapter);
        BanglamoviesListRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }
}