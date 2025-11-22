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

// KELAS ANGGOTA
class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}

// KELAS KLUB
class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    // Tampilkan semua anggota
    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        System.out.println("-------------------");
        System.out.println("Daftar Anggota:");
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
        System.out.println("------------------------");
    }

    // Anggota keluar
    public void anggotaKeluar(Anggota a) {
        anggotaList.remove(a);
        System.out.println(a.getNama() + " keluar dari klub.\n");
    }

    // Hapus klub
    public void tutupKlub() {
        anggotaList.clear();
        System.out.println("Klub ditutup. Semua anggota keluar.\n");
    }
}

// KELAS MAIN
public class MainK {
    public static void main(String[] args) {

        // Membuat anggota (tidak bergantung klub)
        Anggota a1 = new Anggota("Neera");
        Anggota a2 = new Anggota("Bryer");
        Anggota a3 = new Anggota("Sissy");

        // Membuat klub
        Klub klub1 = new Klub("Klub Badminton");

        klub1.tambahAnggota(a1);
        klub1.tambahAnggota(a2);
        klub1.tambahAnggota(a3);

        klub1.infoKlub();

        // Anggota keluar
        klub1.anggotaKeluar(a2);
        klub1.infoKlub();

        // Klub tutup -> anggota tetap ada
        klub1.tutupKlub();
        klub1.infoKlub();

        // Anggota masih bisa masuk ke klub lain
        Klub klub2 = new Klub("Klub Musik");
        klub2.tambahAnggota(a1);
        klub2.infoKlub();  // a1 masih ada sebagai objek
    }
}
