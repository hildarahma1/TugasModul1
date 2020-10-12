package com.hilda.modul1.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new Manusia[3];

        Manusia manusia1 = new Manusia();//constructor pertama
        manusia1.setNama("Jean");
        manusia1.setUmur(20);

        Manusia manusia2 = new Manusia("Fischl");//constructor kedua
        Manusia manusia3 = new Manusia("Barbara", 18);//contructor ketiga

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia) {
            System.out.println("Character ");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}


