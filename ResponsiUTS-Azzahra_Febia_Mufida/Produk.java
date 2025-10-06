/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zara
 */
// Import class DecimalFormat untuk mengatur tampilan angka
import java.text.DecimalFormat;

// Class induk Produk
public class Produk {
    // Atribut private : enkapsulasi
    private String namaProduk;
    private double harga; // tipe data numerik koma/pecahan
    
    // Konstruktor untuk mengisi data awal produk
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Akses modifier    
    // Getter untuk ambil nilai dari atribut private
    // Setter untuk ubah nilai 
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Menampilkan info produk 
    public void tampilkanInfo(){
        DecimalFormat df = new DecimalFormat("#,###"); //Format untuk angka ribuan
        System.out.println("Produk     : " + namaProduk);
        System.out.println("Harga      : Rp" + df.format(harga));
    }
}

// INHERITANCE (PEWARISAN)
//------------------------
// Kelas turunan : Elektronik 
class Elektronik extends Produk {
    // Tambahan atribut garansi
    private String garansi;
    
    // Konstruktor dipanggil menggunakan super()
    // Mengisi data produk + garansi
    public Elektronik(String namaProduk, double harga, String garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }

// OVERRIDE : menambah info garansi
@Override
public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dari Produk
        System.out.println("Garansi    : " + garansi);
    }
}

//------------------------
// Kelas turunan : Makanan
class Makanan extends Produk {
    // Tambahan atribut tanggal kadaluwarsa
    private String tanggalKadaluarsa;

    // Konstruktor dipanggil menggunakan super()
    // Mengisi data produk + tanggal kadaluwarsa
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // OVERRIDE : menambah info tanggal kadaluwarsa
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dari Produk
        System.out.println("Kadaluarsa : " + tanggalKadaluarsa);
    }
}
