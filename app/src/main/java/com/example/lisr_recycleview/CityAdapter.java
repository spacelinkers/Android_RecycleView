package com.example.lisr_recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {
    private ArrayList<CityData> cities;

    public CityAdapter(ArrayList<CityData> cities) {
        this.cities = cities;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        CityData city = cities.get(position);

        viewHolder.name.setText(city.getName());
        viewHolder.description.setText(city.getDescription());
    }

    @Override
    public int getItemCount() {
        if(cities != null) {
            return cities.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public final View view;
        public final TextView name;
        public final TextView description;
        public final ImageView image;

        public ViewHolder(View view){
            super(view);
            this.view = view;
            name = view.findViewById(R.id.name);
            description = view.findViewById(R.id.description);
            image = view.findViewById(R.id.image);
        }
    }
}






