package com.example.applicationuas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Kalimat extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimat);
    }
    public void nama (View v) {
        mp = MediaPlayer.create(this, R.raw.nama);
        mp.start();
    }
    public void adik (View v) {
        mp = MediaPlayer.create(this, R.raw.adik);
        mp.start();
    }
    public void ibu (View v) {
        mp = MediaPlayer.create(this, R.raw.ibu);
        mp.start();
    }
    public void ayah (View v) {
        mp = MediaPlayer.create(this, R.raw.ayah);
        mp.start();
    }
    public void bahagia (View v) {
        mp = MediaPlayer.create(this, R.raw.bahagia);
        mp.start();
    }
    public void riang (View v) {
        mp = MediaPlayer.create(this, R.raw.riang);
        mp.start();
    }
}