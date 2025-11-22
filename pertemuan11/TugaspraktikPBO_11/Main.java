/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO_11;

/**
 *
 * @author zara
 */
import java.util.ArrayList;
import java.util.List;

// Kelas Pengarang (Agregasi)
class Pengarang {
    String namaPengarang;

    Pengarang(String nama) {
        this.namaPengarang = nama;
    }

    void infoPengarang() {
        System.out.println("Nama Pengarang : " + namaPengarang);
    }
}

// Kelas Buku 
class Buku {
    String judul;
    Pengarang pengarang; // hubungan agregasi

    Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    void infoBuku() {
        System.out.println("Judul Buku : " + judul);
        pengarang.infoPengarang();
    }
}

// Kelas Perpustakaan (Komposisi)
class Perpustakaan {
    Buku[] daftarBuku;
    int jumlahBuku = 0;

    Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas]; 
    }

    void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } 
        else {
            System.out.println("Perpustakaan full!\n");
        }
    }

    void tampilkanInfoBuku() {
        System.out.println(">>>> Daftar Buku di Perpustakaan <<<<");
        System.out.println("--------------------------------------");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println();
        }
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        // Buat Pengarang
        Pengarang p1 = new Pengarang("Lexie Xu");
        Pengarang p2 = new Pengarang("Xaviera Putri");
        Pengarang p3 = new Pengarang("Risa Saraswati");
        
        // Buat Buku (menghubungkan buku dengan pengarang)
        Buku b1 = new Buku("Di Balik Sosok Gelap", p1);
        Buku b2 = new Buku("Kimchi Confessions", p2);
        Buku b3 = new Buku("Danur", p3);

        // Buat Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan(3);
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);

        // Tampilkan semua buku
        perpustakaan.tampilkanInfoBuku();
    }
}
