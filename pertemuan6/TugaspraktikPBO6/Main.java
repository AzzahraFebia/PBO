/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO6;

/**
 *
 * @author zara
 */
import java.util.*;

/// KELAS ABSTRAK PRODUK
abstract class Produk {
    String nama;
    double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    // Metode abstrak hitungDiskon()
    public abstract double hitungDiskon();
    
    // Harga akhir setelah diskon
    public double hargaDiskon() {
        return harga - hitungDiskon();
    }
}

// KELAS TURUNAN BUKU
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
     public double hitungDiskon() {
        return harga * 0.1; // Diskon 10%
    }
}

// KELAS TURUNAN ELEKTRONIK
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.20; // Diskon 20%
    }
}

// KELAS TURUNAN PAKAIAN
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.15; // Diskon 15%
    }
}

// KELAS KERANJANG BELANJA
class KeranjangBelanja {
    List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

     public void tampilkanDetail() {
         double total = 0;
         System.out.println("========= DAFTAR BELANJA =========");
         for (Produk p : daftarProduk) {
             double diskon = p.hitungDiskon();
             double hargaFinal = p.hargaDiskon();
             total += hargaFinal;
             
             System.out.println("----------- " + p.nama + " -----------");
             System.out.println("   Harga  : Rp " + p.harga);
             System.out.println("   Diskon : Rp " + diskon);
             System.out.println("   Bayar  : Rp " + hargaFinal);    
         }
         
         System.out.println("--------------------------");
         System.out.println("Total Bayar : Rp " + total);
     }
}

// PROGRAM UTAMA
public class Main {
     public static void main(String[] args) {
         // Buat keranjang
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(new Buku("Di Balik Sosok Gelap", 100000));
        keranjang.tambahProduk(new Elektronik("Lenovo Thinkpad", 7000000));
        keranjang.tambahProduk(new Pakaian("Baju rajut", 150000));

        // Menampilkan detail
        keranjang.tampilkanDetail();
    }
}
 