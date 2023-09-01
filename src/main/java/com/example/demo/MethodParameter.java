package com.example.demo;

public class MethodParameter {
    public static void main(String[] args) {
        // Memanggil metode sayHelloWorld dengan argumen nama pertama dan nama terakhir
        sayHelloWorld("Hari", "Wahyu");
    }

    // Metode untuk menampilkan pesan sapaan dengan dua parameter nama
    // @param firstName Nama pertama
    // @param lastName Nama terakhir
    static void sayHelloWorld(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
