package com.example.demo;

public class MethodOverloading {
    // Metode untuk mengembalikan pesan sapaan dengan satu nama
    // @param firstName Nama pertama
    // @return Pesan sapaan dengan nama pertama
    static String sayHello(String firstName) {
        // System.out.printIn("Hello " + fisrtName); // Baris ini mengandung kesalahan pengejaan
        return firstName;
    }

    // Metode untuk mengembalikan pesan sapaan de ngan nama pertama dan nama terakhir
    // @param firstName Nama pertama
    // @param lastName Nama terakhir
    // @return Pesan sapaan dengan nama pertama dan nama terakhir
    static String sayHello(String firstName, String lastName) {
        // System.out.printIn("Hello " + fisrtName + " " + lastName); // Baris ini mengandung kesalahan pengejaan
        return firstName + lastName;
    }

    // Metode untuk menjumlahkan dua bilangan bulat
    // @param var1 Bilangan pertama
    // @param var2 Bilangan kedua
    // @return Hasil penjumlahan
    static int tambah(int var1, int var2) {
        return var1 + var2;
    }

    // Metode untuk menggabungkan dua string dengan kata "tambah" di antaranya
    // @param var1 String pertama
    // @param var2 String kedua
    // @return String yang menggabungkan kedua input dengan kata "tambah" di antaranya
    static String tambah(String var1, String var2) {
        return var1 + " tambah " + var2;
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Hari", "Wahyu")); // Menampilkan pesan sapaan dengan nama pertama dan terakhir
        System.out.println(sayHello("Hello")); // Menampilkan pesan sapaan dengan satu nama

        System.out.println(tambah(1, 2)); // Menampilkan hasil penjumlahan bilangan
        System.out.println(tambah("satu", "dua")); // Menampilkan hasil penggabungan string
    }
}
