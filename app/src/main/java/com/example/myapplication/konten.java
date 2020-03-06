package com.example.myapplication;

import android.content.Intent;

public class konten {
    private String judul,keterangan;
    private int poto;

    public String getJudul() {
        return judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public int getPoto() {
        return poto;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setPoto(int poto) {
        this.poto = poto;
    }
}
