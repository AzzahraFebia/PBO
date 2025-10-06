/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zara
 */
// Kelas tempat program berjalan
public class Main {
    public static void main(String[] args) {
        // Hiasan untuk judul 
        System.out.println("   SISTEM MANAJEMEN PRODUK & PEGAWAI");
        System.out.println("========================================\n");
        
        // OUTPUT 1 : PRODUK
        //-------------------
        // ELEKTRONIK
        System.out.println("     >> OUTPUT PRODUK <<");
        System.out.println("------------------------------\n");
        System.out.println("| ELEKTRONIK |");
        Elektronik EL1 = new Elektronik("Televisi", 10000000, "2 tahun"); // Membuat objek Elektronik
        EL1.tampilkanInfo(); // Menampilkan info elektronik

        System.out.println("\n");
        
        // MAKANAN
        System.out.println("| MAKANAN |");
        Makanan MK1 = new Makanan("Pancake Matcha", 15000, "1-11-2025"); // Membuat objek Makanan
        MK1.tampilkanInfo(); // Menampilkan info makanan
        
        System.out.println("\n");
        
        // OUTPUT 2 : PEGAWAI
        //-------------------
        // PEGAWAI TETAP
        System.out.println("    >> OUTPUT PEGAWAI <<");
        System.out.println("------------------------------\n");
        System.out.println("| PEGAWAI TETAP |");
        PegawaiTetap PT1 = new PegawaiTetap("Aleena", 6000000, 1500000); // Membuat objek PegawaiTetap
        PT1.tampilkanInfo(); // Menampilkan info pegawai tetap

        System.out.println("\n");
        
        // PEGAWAI KONTRAK
        System.out.println("| PEGAWAI KONTRAK |");
        PegawaiKontrak PK1 = new PegawaiKontrak("Joya", 3500000, "14 bulan"); // Membuat objek PegawaiKontrak
        PK1.tampilkanInfo(); // Menampilkan info pegawai kontrak
        
        System.out.println("\n");
        
        // OUTPUT 3 : POLIMORFISME
        //-------------------
        System.out.println("   >> OUTPUT POLIMORFISME <<");
        System.out.println("-------------------------------\n");
         // Polimorfisme Produk
        Produk PR1 = new Elektronik("Laptop", 7000000, "1 tahun"); // Objek Elektronik disimpan di variabel bertipe Produk
        Produk PR2 = new Makanan("Cheesecake", 16000, "29-10-2025"); // Objek Makanan disimpan di variabel bertipe Produk

        // Polimorfisme Pegawai
        Pegawai PG1 = new PegawaiTetap("Vergy", 5500000, 1000000); // Objek PegawaiTetap disimpan di variabel bertipe Pegawai
        Pegawai PG2 = new PegawaiKontrak("Ravenio", 3400000, "11 bulan"); // Objek PegawaiKontrak disimpan di variabel bertipe Pegawai

        // Menampilkan hasil polimorfisme
        System.out.println("| PRODUK 1 (Elektronik) |");
        PR1.tampilkanInfo(); // Memanggil tampilkanInfo() versi Elektronik
        System.out.println();

        System.out.println("| PRODUK 2 (Makanan) |");
        PR2.tampilkanInfo(); // Memanggil tampilkanInfo() versi Makanan
        System.out.println();

        System.out.println("| PEGAWAI 1 (Pegawai Tetap) |");
        PG1.tampilkanInfo(); // Memanggil method tampilkanInfo() versi PegawaiTetap
        System.out.println();

        System.out.println("| PEGAWAI 2 (Pegawai Kontrak) |");
        PG2.tampilkanInfo(); // Memanggil method tampilkanInfo() versi PegawaiKontrak

        System.out.println("\n=======================================");
    }    
}
