/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author zara
 */
public class Mobil extends KendaraanA {
    private int jumlahPintu;  // Akses tambahan khusus untuk mobil
    
    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    // Method untuk menampilkan informasi lengkap
    public void tampilkanInfoLengkap() {
        super.tampilkanInfoKendaraanA();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}



