package com.example.sqlite.database;

public class Teman {
    String id;
    String Nama;
    String Telepon;

    public Teman() {
    }

    public Teman(String id, String Nama, String Telepon) {
        this.id = id;
        this.Nama = Nama;
        this.Telepon = Telepon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) { Nama = Nama; }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String telepon) {
        Telepon = Telepon;
    }
}
