package com.hilda.modul1.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    //definisi constructor
    //constructor pertama = default tanpa parameter
    public Manusia(){}

    //constructor kedua
    public Manusia(String nama){
        this.nama = nama;
    }

    //constructor ketiga
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    //definisi method
    public  String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
