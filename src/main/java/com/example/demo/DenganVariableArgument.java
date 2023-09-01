package com.example.demo;

public class DenganVariableArgument {
    
    public static void main(String[] args) {
        // Memanggil metode sayCongrats dengan argumen nama dan nilai-nilai
        sayCongrats("Eko", 80, 90, 79, 48, 90);
    }

    // Metode untuk memberikan ucapan "Selamat [nama], Anda Lulus" jika nilai rata-rata >= 75
    // @param name Nama peserta
    // @param values Nilai-nilai peserta
    static void sayCongrats(String name, int... values) {
        // Menghitung total nilai dari values
        int total = 0;
        for (var value : values) {
            total += value;
        }
        // Menghitung nilai rata-rata
        int finalValue = total / values.length;
        
        // Memeriksa apakah nilai rata-rata >= 75
        if (finalValue >= 75) {
            // Jika ya, mencetak pesan lulus
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            // Jika tidak, tidak melakukan apa-apa
        }
    }
}
 