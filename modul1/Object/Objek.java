package com.hilda.modul1.Object;


//Class main/objek class/Demo class
public class Objek {
    public static void main(String[] args) {

        //deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        //setter merubah isi atau menambahakan isi
        mahasiswaTanpa.setNama("Hilda");
        mahasiswaTanpa.setNim(19104015);

        //getter menampilkan isi
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t " + mahasiswaTanpa.getNim());

        //deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 19104015);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }
}
