/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author zara
 */
import java.util.ArrayList;
import java.util.List;

// KELAS PERPUSTAKAAN (INDUK)
class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    // Tambah buku
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    // Tampilkan seluruh buku
    public void infoPerpustakaan() {
        System.out.println(">> Daftar Buku Dalam Perpustakaan <<");
        for (Buku b : bukuList) {
            b.infoBuku();
        }
    }

    // Hapus perpustakaan
    public void tutupPerpustakaan() {
        bukuList.clear();
        System.out.println("Perpustakaan ditutup. Semua buku dihapus.\n");
    }
}

// KELAS BUKU (BAGIAN)
class Buku {
    private String judul;
    private String isbn;

    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void infoBuku() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("ISBN       : " + isbn);
        System.out.println("------------------------");
    }
}

// KELAS MAIN
public class MainP {
    public static void main(String[] args) {

        Perpustakaan p = new Perpustakaan();

        // Tambah beberapa buku
        p.tambahBuku(new Buku("The Exorcist", "9780552166775"));
        p.tambahBuku(new Buku("Danur", "602-220-019-9"));

        // Tampilkan semua buku
        p.infoPerpustakaan();

        // Tutup perpustakaan -> semua buku hilang
        p.tutupPerpustakaan();

        // Coba tampilkan lagi (hasilnya kosong)
        p.infoPerpustakaan();
    }
}
