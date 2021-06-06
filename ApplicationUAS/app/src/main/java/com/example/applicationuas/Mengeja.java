package com.example.applicationuas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Mengeja extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengeja);
    }
    public void playsaya (View v) {
        mp = MediaPlayer.create(this, R.raw.saya);
        mp.start();
    }
    public void playlama (View v) {
        mp = MediaPlayer.create(this, R.raw.lama);
        mp.start();
    }
    public void playbaca (View v) {
        mp = MediaPlayer.create(this, R.raw.baca);
        mp.start();
    }
    public void playraga (View v) {
        mp = MediaPlayer.create(this, R.raw.raga);
        mp.start();
    }
    public void playrasa (View v) {
        mp = MediaPlayer.create(this, R.raw.rasa);
        mp.start();
    }
    public void playjawa (View v) {
        mp = MediaPlayer.create(this, R.raw.jawa);
        mp.start();
    }
}