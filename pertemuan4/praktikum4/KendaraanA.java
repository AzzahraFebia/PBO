/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author zara
 */
public class KendaraanA {
    private String nama;         // Hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks; // Bisa diakses di package yang sama dan subclass
    public String jenisMesin;    // Bisa diakses dari mana saja
    
    // Constructor
    public KendaraanA (String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    
    // Getter Setter untuk variabel private nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraanA() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan Maksimum : " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
}
