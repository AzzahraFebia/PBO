/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KomposisiAgregasi;

/**
 *
 * @author zara
 */
import java.util.ArrayList;

// Kelas Penghuni
class Penghuni {
    private String nama;

    public Penghuni(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void infoPenghuni() {
        System.out.println("Penghuni: " + nama);
    }
}

// Kelas Kamar (Agregasi)
class KamarAgregasi {
    private String namaKamar;
    private ArrayList<Penghuni> penghuniList = new ArrayList<>();

    public KamarAgregasi(String namaKamar) {
        this.namaKamar = namaKamar;
    }

    public void tambahPenghuni(Penghuni p) {
        penghuniList.add(p);
    }

    public void hapusPenghuni(Penghuni p) {
        penghuniList.remove(p);
    }

    public void infoKamar() {
        System.out.println("\nKamar : " + namaKamar);
        if (penghuniList.isEmpty())System.out.println("Tidak ada penghuni");
        else {
            for (Penghuni p : penghuniList) {
                p.infoPenghuni();
            }
        }
    }
}

// Main
public class MainAgregasi {
    public static void main(String[] args) {

        // objek penghuni yang hidup sendiri (agregasi)
        Penghuni p1 = new Penghuni("Najoya");
        Penghuni p2 = new Penghuni("Laruna");

        KamarAgregasi K1 = new KamarAgregasi("Kamar 1");
        KamarAgregasi K2  = new KamarAgregasi("Kamar 2");

        // semua kamar punya penghuni
        K1.tambahPenghuni(p1);
        K2.tambahPenghuni(p2);

        System.out.println("--- Informasi Awal ---");
        K1.infoKamar();
        K2.infoKamar();

        // Laruna keluar 
        System.out.println("\n--------------------");
        System.out.println("!! Laruna keluar !!");
        K2.hapusPenghuni(p2);

        // Najoya pindah dari kamar 1 ke kamar 2
        System.out.println("!! Najoya pindah ke kamar 2 !!");
        System.out.println("--------------------");
        K1.hapusPenghuni(p1);
        K2.tambahPenghuni(p1);

        System.out.println("\n--- Setelah Perubahan ---");
        K1.infoKamar();
        K2.infoKamar();
    }
}
