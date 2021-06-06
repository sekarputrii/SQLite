package com.example.applicationuas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HasilSkor extends AppCompatActivity {
    TextView mtvHasilAkhir;
    Button mbtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skor);

        mtvHasilAkhir = (TextView)findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button)findViewById(R.id.btnMenu);

        setSkor();

        mbtnMenu.setOnClickListener((v) -> {
            Intent i = new Intent(HasilSkor.this, MenuUtama.class);
            startActivity(i);
        });
    }
    public void setSkor() {
        //putExtra dari activity sebelumnya akan ditampung dalam variabel lokal
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");

        if (activity.equals("Pilihan Ganda")) {
            //Jika variabel bernilai pilihan ganda
            mtvHasilAkhir.setText("SKOR : " + skorPilGan);
        }
    }
    public void onBackPressed() {
        Toast.makeText(this, "Yahh tidak bisa kembali, Silahkan klik Menu", Toast.LENGTH_SHORT).show();
    }
}