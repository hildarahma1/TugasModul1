package com.hilda.tugasmodul1.KonversiSuhu;

public class Konversi {
    // Celcius ke Fahrenheit
    public float Celcius_Fahrenheit(float suhu){
        float hasil = (suhu * 9/5) + 32;
        return hasil;
    }

    //Fahrenheit ke Kelvin
    public float Fahrenheit_Kelvin(float suhu) {
        float hasil = (suhu - 32) * 5/9 + 273;
        return hasil;
    }

    //Kelvin ke Reamur
    public float Kelvin_Reamur(float suhu) {
        float hasil = (suhu - 273) * 4/5;
        return hasil;
    }

    //Reamur ke Celcius
    public float CelciusFahrenheit(float suhu) {
        float hasil = suhu * 5/4;
        return hasil;

    }
}
