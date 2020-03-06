package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView relatifList;
    private LinearLayout profile;
    private ArrayList<konten> konten = new  ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile = findViewById(R.id.provil);
        relatifList = findViewById(R.id.relatifList);
        relatifList.setHasFixedSize(true);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,provil.class);
                startActivity(intent);
            }
        });

        konten.addAll(data.getListData());
        showKonten();
    }

    private void showKonten() {
        relatifList.setLayoutManager(new LinearLayoutManager(this));
        dataAdapter dataAdapter = new dataAdapter(konten);
        relatifList.setAdapter(dataAdapter);
    }
}
