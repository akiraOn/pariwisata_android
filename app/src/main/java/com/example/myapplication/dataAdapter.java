package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class dataAdapter extends RecyclerView.Adapter<dataAdapter.dataAdapterHolder> {
    private ArrayList<konten> listKonten;


    public dataAdapter(ArrayList<konten> list){
        this.listKonten  = list;
    }


    @NonNull
    @Override
    public dataAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tampilkan = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_list,parent,false);
        return new dataAdapterHolder(tampilkan);
    }

    @Override
    public void onBindViewHolder(@NonNull final dataAdapterHolder holder, final int position) {
        final konten konten = listKonten.get(position);
        holder.judul.setText(konten.getJudul());
        holder.desKonten.setText(konten.getKeterangan());
        holder.potoKonten.setBackgroundResource(konten.getPoto());


        holder.ViewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),item_des.class);
                intent.putExtra("judul",konten.getJudul());
                intent.putExtra("keterangan",konten.getKeterangan());
                intent.putExtra("poto",konten.getPoto());
                v.getContext().startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return listKonten.size();
    }

    public class dataAdapterHolder extends RecyclerView.ViewHolder {

        TextView judul,desKonten;
        ImageView potoKonten;
        CardView ViewList;

        public dataAdapterHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judulKonten);
            desKonten = itemView.findViewById(R.id.desKonten);
            ViewList = itemView.findViewById(R.id.ViewList);
            potoKonten = itemView.findViewById(R.id.potoKonten);
        }
    }

}
