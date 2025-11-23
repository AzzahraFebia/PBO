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
import java.util.List;

// Kelas rumah (induk komposisi)
class Rumah {
    private List<Kamar> kamarList;

    public Rumah() {
        this.kamarList = new ArrayList<>();
    }

    // Tambah kamar
    public void tambahKamar(Kamar kamar) {
        kamarList.add(kamar);
    }

    // Tampilkan seluruh kamar
    public void infoRumah() {
        System.out.println(">> Daftar Kamar Dalam Rumah <<");
        if (kamarList.isEmpty()) {
            System.out.println("Tidak ada kamar\n");
            return;
        }
        for (Kamar k : kamarList) {
            k.infoKamar();
        }
    }

    // Hapus rumah (semua kamar hilang)
    public void hancurkanRumah() {
        kamarList.clear();
        System.out.println("\n---------------------");
        System.out.println("Rumah dihancurkan. Semua kamar hilang.");
        System.out.println("---------------------\n");
    }
}

// Kelas kamar (bagian komposisi)
class Kamar {
    private String namaKamar;

    public Kamar(String namaKamar) {
        this.namaKamar = namaKamar;
    }

    public void infoKamar() {
        System.out.println("Nama Kamar : " + namaKamar);
    }
}

// KELAS MAIN
public class MainKomposisi {
    public static void main(String[] args) {

        Rumah r = new Rumah();

        // Tambah beberapa kamar
        r.tambahKamar(new Kamar("Kamar Utama"));
        r.tambahKamar(new Kamar("Kamar Tamu"));

        // Tampilkan daftar kamar
        r.infoRumah();

        // Hancurkan rumah → semua kamar hilang
        r.hancurkanRumah();

        // Coba tampilkan lagi (kosong)
        r.infoRumah();
    }
}
