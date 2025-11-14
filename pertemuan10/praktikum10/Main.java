/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author zara
 */
// Interface
interface OperasiHitung {
    int hitung(int a, int b);
}

// Kelas Penjumlahan
class Penjumlahan implements OperasiHitung {
    @Override
    public int hitung(int a, int b) {
        return a + b;
    }
}

// Kelas Pengurangan
class Pengurangan implements OperasiHitung {
    @Override
    public int hitung(int a, int b) {
        return a - b;
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5)); // Output: 15
 
        // Objek Pengurangan
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5)); // Output: 5
    }
}
