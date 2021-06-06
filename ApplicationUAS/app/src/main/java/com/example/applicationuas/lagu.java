package com.example.applicationuas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class lagu extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu);
    }
    public void twinklestar(View v) {
        mp = MediaPlayer.create(this, R.raw.twinkle);
        mp.start();
    }
    public void babyshark(View v) {
        mp = MediaPlayer.create(this, R.raw.baby);
        mp.start();
    }
    public void laguABC(View v) {
        mp = MediaPlayer.create(this, R.raw.ABC);
        mp.start();
    }
    public void dynosaurus(View v) {
        mp = MediaPlayer.create(this, R.raw.dino);
        mp.start();
    }
    public void Pause(View v) { mp.pause(); }
}