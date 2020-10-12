package com.hilda.modul1.Object;

public class Mahasiswa {
    String nama;
    int nim;

    //constructor
    public Mahasiswa() {
    } //konstruktor yang masih kosonga, konstruktor adalah sebuah metode yang namanya mirip methodnya


    public Mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }

    //Getter & setter
    public  String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getNim(){
        return nim;
    }

    public void setNim(int nim){
        this.nim = nim;
    }
}
