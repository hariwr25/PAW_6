package com.example.demo;

public class Kode_Scope {
    public static void main(String[] args) {
        sayHello("John"); // Memanggil metode sayHello dengan argumen "John"
    }

    // Metode untuk menyapa dengan nama
    // @param name Nama yang akan disapa
    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name; // Variabel hi hanya bisa diakses di dalam blok if
            System.out.println(hi); // Menampilkan salam "Hi" jika nama tidak kosong
        }

        System.out.println(hello); // Menampilkan salam "Hello" + nama
    }
}
