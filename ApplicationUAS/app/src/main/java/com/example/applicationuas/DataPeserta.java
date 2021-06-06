package com.example.applicationuas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataPeserta extends SQLiteOpenHelper {
    public DataPeserta (Context context) {super(context, Database_Name, null, 1); }

    public void createTable (SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS peserta (id integer PRIMARY KEY autoincrement, " +
                "nama TEXT, tanggallahir TEXT, umur TEXT);");
    }
    public void generateData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(NAMA, "Sekar");
        cv.put(TANGGALLAHIR, "08-03-2021");
        cv.put(UMUR, "20");

        db.insert("peserta", NAMA, cv);
    }
    private final static String Database_Name = "dbpeserta";
    private final static String NAMA = "nama";
    private final static String TANGGALLAHIR = "tanggallahir";
    private final static String UMUR = "umur";

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //TODO Auto-generated method stub
    }
    public void onCreate (SQLiteDatabase db) {
        //TODO Auto-generated method stub
    }
}
