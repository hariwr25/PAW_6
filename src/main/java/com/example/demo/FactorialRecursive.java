package com.example.demo;

public class FactorialRecursive {
    // Metode rekursif untuk menghitung faktorial dari sebuah angka
    // @param value Angka yang akan dihitung faktorialnya
    // @return Hasil faktorial dari angka value
    static int factorialRecursive(int value) {
        // Base case: Jika value = 1, kembalikan nilai 1
        if (value == 1) {
            return 1;
        } else {
            // Recursive case: Hitung faktorial dengan memanggil diri sendiri (rekursif)
            return value * factorialRecursive(value - 1);
        }
    }

    
    public static void main(String[] args) {
        // Mendefinisikan variabel dataInput dan hasilData
        int dataInput = 5, hasilData;
        // Memanggil metode factorialRecursive untuk menghitung faktorial dari dataInput
        hasilData = factorialRecursive(dataInput);
        // Menampilkan hasil faktorial rekursif dari dataInput
        System.out.println(dataInput + " factorialRec. nya = " + hasilData);
    }
}
