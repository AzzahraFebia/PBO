/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author zara
 */
// AGREGASI
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {
    private List<Anggota> anggotaList = new ArrayList<>();
    private List<Buku> bukuList = new ArrayList<>();

    public void tambahAnggota(Anggota a) {
        anggotaList.add(a);
    }
    public void tambahBuku(Buku b) {
        bukuList.add(b);
    }

    public void tampilAnggota() {
        if (anggotaList.isEmpty()) {
            System.out.println("Belum ada anggota.");
        } else {
            System.out.println("Daftar Anggota:");
            for (Anggota a : anggotaList) {
                System.out.println("- " + a.getNama());
            }
        }
    }
    public void tampilBuku() {
        if (bukuList.isEmpty()) {
            System.out.println("Belum ada buku.");
        } else {
            System.out.println("Daftar Buku:");
            for (Buku b : bukuList) {
                b.tampilInfo();
            }
        }
    }
    
    public Buku cariBukuId(String id) {
        for (Buku b : bukuList) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }
}

