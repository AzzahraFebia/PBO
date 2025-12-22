/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author zara
 */
// KOMPOSISI 
import java.util.ArrayList;
import java.util.List;

public class TransaksiPinjam implements Peminjaman {
    private List<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    @Override
    public void pinjam() {
        System.out.println("Peminjaman buku:");
        for (Buku b : daftarBuku) {
            b.tampilInfo();
        }
    }

    @Override
    public void kembalikan() {
        System.out.println("Buku dikembalikan.");
        daftarBuku.clear();
    }
}
