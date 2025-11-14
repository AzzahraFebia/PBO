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

// Kelas Produk
class Produk {
    private String nama;
    private double harga;
    private Pembayaran Pajak;

    public Produk(String nama, double harga, Pembayaran Pajak) {
        this.nama = nama;
        this.harga = harga;
        this.Pajak = Pajak;
    }

    public void tampilkanDetail() {
        double pajak = Pajak.hitungPajak(harga);
        double total = harga + pajak;

        System.out.println("Nama Produk       : " + nama);
        System.out.println("Harga Barang      : " + harga);
        System.out.println("Pajak             : " + pajak);
        System.out.println("Total Pembayaran  : " + total);
        System.out.println();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {

        Produk elektronik = new Produk("Mixer", 450000, new Elektronik());
        Produk makanan = new Produk("Pancake", 25000, new Makanan());

        System.out.println("=== Produk Elektronik ===");
        elektronik.tampilkanDetail();

        System.out.println("=== Produk Makanan ===");
        makanan.tampilkanDetail();
    }
}
