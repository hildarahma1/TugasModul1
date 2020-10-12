package com.hilda.tugasmodul1.KonversiSuhu;

import java.util.Scanner;

public class DemoKonversi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Konversi konversiSuhu = new Konversi();

        // masukkan suhu celcius
        System.out.print("Inputkan Suhu Dalam Celcius\t: ");
        float suhu = scan.nextFloat();

        //konversi suhu Celcius Ke Fahrenheit
        Float suhu1 = konversiSuhu.Celcius_Fahrenheit(suhu);
        System.out.println("Celcius Ke Fahrenheit\t: " + suhu1);

        //konversi suhu Fahrenheit Ke Kelvin
        Float suhu2 = konversiSuhu.Fahrenheit_Kelvin(suhu1);
        System.out.println("Fahrenheit Ke Kelvin\t: " + suhu2);

        //konversi suhu Kelvin Ke Reamur
        Float suhu3 = konversiSuhu.Kelvin_Reamur(suhu2);
        System.out.println("Kelvin Ke Reamur\t\t: " + suhu3);

        //konversi suhu Reamur Ke Celcius
        Float suhu4 = konversiSuhu.Celcius_Fahrenheit(suhu3);
        System.out.println("Reamur Ke Celcius\t\t: " + suhu4);

    }
}
