package com.example.applicationuas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Alphabet extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
    }
    public void playabc(View v) {
        mp = MediaPlayer.create(this, R.raw.ABC);
        mp.start();
    }
    public void pause(View v) {
        mp.pause();
    }
}