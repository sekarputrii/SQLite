package com.example.applicationuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }
    public void Pendaftaran(View view) {
        Intent intent = new Intent(MenuUtama.this, Pendaftaran.class);
        startActivity(intent);
    }
    public void ABC(View v) {
        Intent intent = new Intent(MenuUtama.this, Alphabet.class);
        startActivity(intent);
    }
    public void Mengeja(View v) {
        Intent intent = new Intent(MenuUtama.this, Mengeja.class);
        startActivity(intent);
    }
    public void Kalimat(View v) {
        Intent intent = new Intent(MenuUtama.this, Kalimat.class);
        startActivity(intent);
    }
    public void Lagu(View v) {
        Intent intent = new Intent(MenuUtama.this, lagu.class);
        startActivity(intent);
    }
    public void Quiz(View v) {
        Intent intent = new Intent(MenuUtama.this, Quiz.class);
        startActivity(intent);
    }
    public void Back(View v) {
        Intent intent = new Intent(MenuUtama.this, MainActivity.class);
        finish();
    }
}