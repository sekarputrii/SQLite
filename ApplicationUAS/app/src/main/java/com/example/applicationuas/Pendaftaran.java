package com.example.applicationuas;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Pendaftaran extends AppCompatActivity {

    private SQLiteDatabase db = null;
    private Cursor pesertaCursor = null;
    private EditText txtnama;
    private EditText txttanggallahir;
    private EditText txtumur;

    private DataPeserta datapeserta = null;
    public final static String NAMA = "nama";
    public final static String TANGGALLAHIR = "tanggallahir";
    public final static String UMUR = "umur";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datapeserta = new DataPeserta(this);
        db = datapeserta.getWritableDatabase();
        datapeserta.createTable(db);
        datapeserta.generateData(db);

        setContentView(R.layout.activity_pendaftaran);
        txtnama = (EditText) findViewById(R.id.txtnama);
        txttanggallahir = (EditText) findViewById(R.id.txttanggallahir);
        txtumur = (EditText) findViewById(R.id.txtumur);
    }
    public void Simpan (View view) {
        db.execSQL("insert into peserta (nama, tanggallahir, umur) values ('"+ txtnama.getText().toString() +"','"+ txttanggallahir.getText().toString() + "','" + txtumur.getText().toString() +"','");
        Toast.makeText(getBaseContext(), "Data disimpan", Toast.LENGTH_LONG).show();
    }
}