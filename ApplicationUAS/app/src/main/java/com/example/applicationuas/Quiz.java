package com.example.applicationuas;

import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz extends AppCompatActivity {
    TextView mvtSkor, mvtSoal;
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3, mrbPilihanJawaban4;
    Button mbtnSubmit;
    int skor = 0;
    int arr;
    int x;
    String jawaban;

    Quiz kuis = new Quiz();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mvtSkor = (TextView) findViewById(R.id.tvSkor);
        mvtSoal = (TextView) findViewById(R.id.tvSoal);
        mrgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        mrbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        mrbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        mrbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        mrbPilihanJawaban4 = (RadioButton) findViewById(R.id.rbPilihanJawaban4);
        mbtnSubmit = (Button) findViewById(R.id.btnSubmit);

        mvtSkor.setText("" + skor);
       setKonten();

       mbtnSubmit.setOnClickListener((v) -> {cekJawaban(); });
    }
    public void setKonten() {
        mrgPilihanJawaban.clearCheck();
        arr = kuis.pertanyaan.length;
        if (x >= arr) {
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(Quiz.this, HasilSkor.class);

            //waktu pindah activity, sekaligus membawa nilai jumlahSkor yang ditampung dengan insial skorAkhir
            //skorAkhir = jumlahSkor
            i.putExtra("skorAkhir", jumlahSkor);
            i.putExtra("activity", "PilihanGanda");
            startActivity(i);
        } else  {
            //setting text dengan mengambil text dari method getter di kelas Soal Pilihan Ganda
            mvtSoal.setText(kuis.getPertanyaan(x));
            mrbPilihanJawaban1.setText(kuis.getPilihanJawaban1(x));
            mrbPilihanJawaban2.setText(kuis.getPilihanJawaban2(x));
            mrbPilihanJawaban3.setText(kuis.getPilihanJawaban3(x));
            mrbPilihanJawaban4.setText(kuis.getPilihanJawaban4(x));
            jawaban = kuis.getJawabanBenar(x);
        }
        x++;
    }

    public void cekJawaban() {
        if (mrbPilihanJawaban1.isChecked()) {
            if (mrbPilihanJawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (mrbPilihanJawaban2.isChecked()) {
            if (mrbPilihanJawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if (mrbPilihanJawaban3.isChecked()) {
            if (mrbPilihanJawaban3.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mvtSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if (mrbPilihanJawaban4.isChecked()) {
                if (mrbPilihanJawaban4.getText().toString().equals(jawaban)) {
                    skor = skor + 20;
                    mvtSkor.setText("" + skor);
                    Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                    setKonten();
                } else {
                    mvtSkor.setText("" + skor);
                    Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                    setKonten();
                }
        }else {
            Toast.makeText(this, "Ayo coba jawab!", Toast.LENGTH_SHORT).show();
        }
    }
    public void onBackPreseed() {
        Toast.makeText(this, "Ayo selesaikan", Toast.LENGTH_SHORT).show();
    }
}