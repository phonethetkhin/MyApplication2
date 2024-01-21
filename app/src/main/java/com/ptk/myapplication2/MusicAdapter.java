package com.ptk.myapplication2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder>{

  ArrayList<MusicModel> musicModelArrayList;

    public MusicAdapter(ArrayList<MusicModel> musicModelArrayList) {
        this.musicModelArrayList = musicModelArrayList;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_song,parent,false);
        return new MusicViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
    holder.tvName.setText(musicModelArrayList.get(position).getMusicName());
    holder.tvArtist.setText(musicModelArrayList.get(position).getArtistName());
    }

    @Override
    public int getItemCount() {
        return musicModelArrayList.size();
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvArtist;
        ImageView ivFav;
        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvArtist = itemView.findViewById(R.id.tvArtist);
            ivFav = itemView.findViewById(R.id.ivFav);
        }
    }
}
