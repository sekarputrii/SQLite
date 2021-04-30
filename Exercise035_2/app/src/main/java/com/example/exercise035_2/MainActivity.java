package com.example.exercise035_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    String[] daftar;
    ListView listView01;
    Menu menu;
    protected Cursor cursor;
    DBController dbController;
    public static MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent((MainActivity.this, CreateData.class);
                startActivity(intent);
            }
        });
                ma = this;
                dbController = new DBController(this);
                RefreshList();
    }
    public void RefreshList() {
        SQLiteDatabase db = dbController.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM Data", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            daftar[i] = cursor.getString(1).toString();
        }
        listView01 = (ListView) findViewById(R.id.listView1);
        listView01.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        listView01.setSelected(true);
        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                final String selection = daftar[arg2];
                final CharSequence[] dialogitem = {"LihatData", "Edit Data", "Hapus Data"};
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Pilihan");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        switch (item) {
                            case 0:
                                Intent i = new Intent(getApplicationContext(), LihatData.class);
                                i.putExtra("Nama", selection);
                                startActivity(i);
                                break;
                            case 1:
                                Intent in = new Intent(getApplicationContext(), LihatData.class);
                                i.putExtra("Nama", selection);
                                startActivity(in);
                                break;
                            case 2:
                                SQLiteDatabase db = dbController.getWritableDatabase();
                                db.execSQL("Delete From Data where Nama = '" + selection + "'");
                                RefreshList();
                                break;
                        }
                    }
                });
                builder.create().show();
            }
        });
        ((ArrayAdapter) listView01.getAdapter()).notifyDataSetInvalidated();
    }

    @Override
    public boolean onCreateOptionMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean OnOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();
    }
}