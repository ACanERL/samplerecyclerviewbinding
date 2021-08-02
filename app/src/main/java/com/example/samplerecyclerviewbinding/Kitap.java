package com.example.samplerecyclerviewbinding;

import android.graphics.drawable.Drawable;

public class Kitap {
    private String kitapAdi;
    private String kitapYazari;
    private Drawable kitapResim;

    public Kitap(String kitapAdi, String kitapYazari, Drawable kitapResim){
        this.kitapAdi=kitapAdi;
        this.kitapYazari =kitapYazari;
        this.kitapResim=kitapResim;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public Drawable getKitapResim() {
        return kitapResim;
    }
}
