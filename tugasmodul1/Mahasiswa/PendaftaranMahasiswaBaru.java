package com.hilda.tugasmodul1.Mahasiswa;

import java.util.Scanner;

public class PendaftaranMahasiswaBaru {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("---------- Pendaftaran Mahasiswa Baru IT Telkom Purwokerto ----------");

        // Inputkan nama lengkap calon mahasiswa
        System.out.print("Nama Lengkap\t\t\t: ");
        String nama = scan.nextLine();
        // Inputkan tempat tanggal lahir
        System.out.print("Tempat Tanggal Lahir\t: ");
        String ttl = scan.nextLine();
        // Inputkan alamat
        System.out.print("Alamat\t\t\t\t\t: ");
        String alamat = scan.nextLine();
        // Inputkan agama
        System.out.print("Agama\t\t\t\t\t: ");
        String agama = scan.nextLine();
        // Inputkan jenis kelamin
        System.out.print("Jenis Kelamin\t\t\t: ");
        String kelamin = scan.nextLine();
        System.out.println();
        // Inputkan jurusan yang dipilih
        System.out.println("----- Fakultas Informatika -----");
        System.out.println("S1 Software Engineering");
        System.out.println("S1 Teknik Informatika");
        System.out.println("S1 Sistem Informasi");
        System.out.println("S1 Sains Data");
        System.out.println();

        System.out.println("----- Fakultas Teknik Telekomunikasi Dan Elektro  -----");
        System.out.println("S1 Teknik Telekomunikasi");
        System.out.println("S1 Teknik Elektro");
        System.out.println("S1 Biomedis");
        System.out.println("D3 Teknik Komunikasi");
        System.out.println();

        System.out.println("----- Fakultas Rekayasa Industri Dan Design -----");
        System.out.println("S1 Design Komunikasi Visual");
        System.out.println("S1 Teknik Industri");
        System.out.println("S1 Sistem Informasi");
        System.out.println();
        System.out.print("Masukan Pilihan Jurusan\t: ");
        String jurusan = scan.nextLine();

        // Input Email
        System.out.print("Masukan Email\t\t\t: ");
        String email = scan.nextLine();
        // Input Nomer HP
        System.out.print("Masukan Nomer HP\t\t: ");
        String hp = scan.nextLine();
        // Input nilai UTBK
        System.out.print("Masukan Nilai UTBK\t\t: ");
        int nilai = scan.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(nama, ttl, alamat, agama, kelamin, jurusan, email, hp, nilai); // Deklarasi Objek

        // Output
        System.out.println();
        System.out.println("----- Data Calon Mahasiswa IT Telkom Purwokerto -----");
        System.out.println("Nama\t\t\t : " + mahasiswa.nama);
        System.out.println("TTL\t\t\t\t : " + mahasiswa.ttl);
        System.out.println("Alamat\t\t\t : " + mahasiswa.alamat);
        System.out.println("Agama\t\t\t : " + mahasiswa.agama);
        System.out.println("Jenis Kelamin\t : " + mahasiswa.kelamin);
        System.out.println("Pilihan Jurusan\t : " + mahasiswa.PilihanJurusan);
        System.out.println("Nomer HP\t\t : " + mahasiswa.hp);
        System.out.println("Email\t\t\t : " + mahasiswa.email);
        System.out.println("Nilai UTBK\t\t : " + mahasiswa.NilaiUTBK);
        System.out.println("Terima Kasih Telah Mendaftarkan Diri Menjadi Calon Mahasiswa Baru");
    }
}
