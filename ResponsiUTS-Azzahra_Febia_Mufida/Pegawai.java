package UTS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zara
 */
// Import class DecimalFormat untuk mengatur tampilan angka
import java.text.DecimalFormat;

// Class induk Pegawai
public class Pegawai {
    // Atribut private : enkapsulasi
    private String namaPegawai;
    private double gaji; // tipe data numerik koma/pecahan

    // Konstruktor untuk mengisi data awal Pegawai
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Akses modifier    
    // Getter untuk ambil nilai dari atribut private
    // Setter untuk ubah nilai 
    public String getNamaPegawai() { 
        return namaPegawai; 
    }
    public void setNamaPegawai(String namaPegawai) { 
        this.namaPegawai = namaPegawai; 
    }

    public double getGaji() { 
        return gaji; 
    }
    public void setGaji(double gaji) { 
        this.gaji = gaji; 
    }
    
    // Menampilkan info Pegawai
     public void tampilkanInfo() {
        DecimalFormat df = new DecimalFormat("#,###"); //Format untuk angka ribuan
        System.out.println("Nama Pegawai   : " + namaPegawai);
        System.out.println("Gaji           : Rp" + df.format(gaji));
    }
}

// INHERITANCE (PEWARISAN)
//------------------------
// Kelas turunan : Pegawai Tetap
class PegawaiTetap extends Pegawai {
    // Tambahan atribut tunjangan
    private double tunjangan;

    // Konstruktor dipanggil menggunakan super()
    // Mengisi data pegawai + tunjangan
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    // OVERRIDE : menambah info tunjangan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dari Pegawai
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Tunjangan      : Rp" + df.format(tunjangan));
    }
}

//------------------------
// Kelas turunan : Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
    // Tambahan atribut lama kontrak
    private String lamaKontrak;

    //Konstruktor dipanggil menggunakan super()
    // Mengisi data pegawai + lama kontrak
    public PegawaiKontrak(String namaPegawai, double gaji, String lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    // OVERRIDE : menambah info lama kontrak
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dari Pegawai
        System.out.println("Lama Kontrak   : " + lamaKontrak);
    }
}