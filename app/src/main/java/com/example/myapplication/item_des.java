package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class item_des extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_des);

        TextView View_judul = findViewById(R.id.judulKontenDA);
        TextView View_des = findViewById(R.id.desKontenDA);
        ImageView View_poto = findViewById(R.id.potoKontenDA);



        // Set (ambil data) dari halaman sebelumnya
        Intent intent = getIntent();

        String Title = intent.getExtras().getString("judul");
        String Des = intent.getExtras().getString("keterangan");
        int Poto = intent.getExtras().getInt("poto");

        // Set ke view deskripsi

        View_judul.setText(Title);
        View_des.setText(Des);
        View_poto.setBackgroundResource(Poto);

    }
}
