package com.example.constraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Deklarasi variabel dengan jenis data context
    Context mContext;

    //Deklarasi variabel dengan jenis data layout inflater
    LayoutInflater inflater;

    //Deklarasi variabel dengan jenis data arrayList
    private ArrayList<ClassNama> arrayList;

    //membuat konstruktor ListViewAdapter
    public  ListViewAdapter(Context context){
        //Memberi nilai mContext dengan context
        mContext = context;
        //Mengatur layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);
        //Menambahkan nilai arraylist dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();
        this.arrayList.addAll(Home_Activity.classNamaArrayList);
    }
    //Membuat class untuk mendeklarasikan tempat untuk meletakkan isi kedalam listView
    public class ViewHolder {
        //Mendeklarasikan variabel dengan jenis TextView
        TextView name;
    }
    //fungsi getCount() mengembalikan jumlah item yang akan ditampilkan dalam list
    @Override
    public int getCount() {
        //Mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }
    //Fungsi ini digunakan untuk mendapatkan data item yang terkait dengan posisi
    //tertentu dalam kumpulan data untuk mendapatkan data yang sesuai dari Lokasi
    //tertentu dalam pengumpulan data item
    @Override
    public Object getItem(int i) {
        //Mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }
    //Fungsi ini mengembalikan "nilai" dari posisi item ke adaptor
    @Override
    public long getItemId(int i) {
        return i;
    }
    //Fungsi ini secara otomatis dipanggil ketika tampilan item list siap untuk ditampilkan/akan ditampilkan
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Deklarasi variabel dengan jenis data ViewHolder
        final ViewHolder holder;

        //Membuat kondisi apakah view null atau tidak
        if (view == null){
            //Membuat objek view holder
            holder = new ViewHolder();
            //Mengatur layout untuk menampilkan item
            view = inflater.inflate(R.layout.item_listview, null);
            //set id untuk textview
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);
            //Menyimpan data dalam tampilan tanpa menggunakan struktur data lain
            view.setTag(holder);
        } else {
            //Mengatur holder untuk mengembalikan nilai dari view tag
            holder = (ViewHolder) view.getTag();
        }
        //Set item ke TextView
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getNama());
        //Mengembalikan nilai ke variabel view
        return view;
    }
}
