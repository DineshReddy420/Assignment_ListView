package com.example.custome_list_view.adpaters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.custome_list_view.Models.Movies;
import com.example.custome_list_view.R;

import java.util.ArrayList;

public class MoviesCustomAdpater extends BaseAdapter {

    ArrayList<Movies> movies;

    public MoviesCustomAdpater(ArrayList<Movies> movies) {
        this.movies=movies;

    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    class ViewHolder{

        TextView moviesNameTV;
        TextView RatingTV;
        TextView DescriptionTV;
        ImageView ImageTV;
        public  ViewHolder(View view)
        {
            moviesNameTV=view.findViewById(R.id.MovieName);
            RatingTV=view.findViewById(R.id.ratings);
            DescriptionTV=view.findViewById(R.id.Description);
            ImageTV=view.findViewById(R.id.image_view);

        }
    }
}
