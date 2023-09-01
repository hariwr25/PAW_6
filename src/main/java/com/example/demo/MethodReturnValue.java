package com.example.demo;

public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100; // Mendeklarasikan variabel a dengan nilai 100
        var b = 200; // Mendeklarasikan variabel b dengan nilai 200
        var c = sum(a, b); // Memanggil metode sum() dengan nilai a dan b sebagai argumen

        System.out.println(c); // Menampilkan nilai yang dikembalikan oleh metode sum()
    }

    // Metode untuk menjumlahkan dua nilai dan mengembalikan hasilnya
    // @param value1 Nilai pertama yang akan dijumlahkan
    // @param value2 Nilai kedua yang akan dijumlahkan
    // @return Hasil penjumlahan dari value1 dan value2
    static int sum(int value1, int value2) {
        var total = value1 + value2; // Melakukan penjumlahan value1 dan value2
        return total; // Mengembalikan hasil penjumlahan
    }
}
