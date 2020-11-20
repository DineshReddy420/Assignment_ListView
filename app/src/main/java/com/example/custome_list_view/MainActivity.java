package com.example.custome_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.custome_list_view.Models.Movies;
import com.example.custome_list_view.adpaters.MoviesCustomAdpater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayList<Movies> movies;
    Integer[] imgid={
            R.drawable.m1917,R.drawable.dark,
            R.drawable.interstellar,R.drawable.inception,
            R.drawable.joker,
    };

    public ArrayList<Movies> getArrayMovies(){
        ArrayList<Movies> movies=new ArrayList<>();
        movies.add(new Movies("1917","4.0/5","New Movie",imgid ));
        movies.add(new Movies("Dark","4.2/5","New Movie",imgid));
        movies.add(new Movies("Interstellar","3.5/5","New Movie",imgid));
        movies.add(new Movies("Inception","4.0/5","New Movie",imgid));
        movies.add(new Movies("Joker","5/5","New Movie",imgid));
        return movies;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.MoviesListView);
        movies=getArrayMovies();
        MoviesCustomAdpater adpater=new MoviesCustomAdpater(movies);
        listView.setAdapter(adpater);
    }
}