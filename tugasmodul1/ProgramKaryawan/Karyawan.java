package com.hilda.tugasmodul1.ProgramKaryawan;

public class Karyawan {
    private static String nama = "Mahatvayodha";
    private static String ttl = "Wangon, 5 Desember 1999";
    private static String alamat = "Jalan Lingkar Timur Terminal Wangon";
    private static String kelamin = "Laki-Laki";
    private static String status = "Belum Kawin";
    private static String riwayat= "S1 Software Engineering";
    private static String email = "yodha2001@gmail.com";
    private static String nomer = "082168759876";

    public static void main(String[] args) {
        // cetak biodata
        System.out.println("----- Biodata Karyawan PT Maju Luhur -----");
        System.out.println("Nama Lengkap\t\t : " + nama);
        System.out.println("TTL\t\t\t\t\t : " + ttl);
        System.out.println("Alamat\t\t\t\t : " + alamat);
        System.out.println("Jenis Kelamin\t\t : " + kelamin);
        System.out.println("Status Pernikahan\t : " + status);
        System.out.println("Pendidikan Terakhir\t : " + riwayat);
        System.out.println("Email\t\t\t\t : " + email);
        System.out.println("Nomor HP\t\t\t : " + nomer);
    }
}
