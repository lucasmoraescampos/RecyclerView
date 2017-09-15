package com.example.lucas.recyclerview;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.List;
import com.squareup.picasso.Picasso;

/**
 * Created by Lucas on 14/09/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CompanieViewHolder>{

    private List<Companie> companiesList;
    private Context mContext;

    public static class CompanieViewHolder extends RecyclerView.ViewHolder {
        public CardView cv;
        public TextView name, hr, distance;
        public ImageView photo;

        public CompanieViewHolder(View view) {
            super(view);
            this.cv = (CardView) view.findViewById(R.id.cvCompanie);
            this.name = (TextView) view.findViewById(R.id.companie_name);
            this.hr = (TextView) view.findViewById(R.id.companie_hr);
            this.distance = (TextView) view.findViewById(R.id.companie_distance);
            this.photo = (ImageView) view.findViewById(R.id.companie_photo);
        }
    }

    public RVAdapter(List<Companie> companiesList, Context context){
        this.companiesList = companiesList;
        this.mContext = context;
    }

    @Override
    public CompanieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.dialog_companies, parent, false);
        return new CompanieViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CompanieViewHolder holder, int position) {
        Companie companie = companiesList.get(position);
        holder.photo.setImageResource(companie.getPhoto());
        holder.name.setText(companie.getName());
        holder.distance.setText(companie.getDistance());
        holder.hr.setText(companie.getHr());
    }

    @Override
    public int getItemCount() {
        return companiesList.size();
    }
}