/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO_10;

/**
 *
 * @author zara
 */
// Interface Pembayaran
interface Pembayaran {
    double hitungPajak(double harga);
}

// Kelas Elektronik
class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10; // Pajak 10%
    }
}

// Kelas Makanan
class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05; // Pajak 5%
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran e = new Elektronik();
        System.out.println("Pajak Elektronik: " + e.hitungPajak(200000));

        // Objek Makanan
        Pembayaran m = new Makanan();
        System.out.println("Pajak Makanan: " + m.hitungPajak(50000));
    }
}