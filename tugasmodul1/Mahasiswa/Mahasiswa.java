package com.hilda.tugasmodul1.Mahasiswa;

public class Mahasiswa {
    String nama, ttl, agama, alamat, kelamin, PilihanJurusan, email, hp;
    int NilaiUTBK;


    public Mahasiswa(String nama, String ttl, String alamat, String agama, String kelamin, String PilihanJurusan, String email, String hp, int NilaiUTBK) {
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.agama = agama;
        this.kelamin = kelamin;
        this.PilihanJurusan = PilihanJurusan;
        this.email = email;
        this.NilaiUTBK = NilaiUTBK;
        this.hp = hp;
    }
}
