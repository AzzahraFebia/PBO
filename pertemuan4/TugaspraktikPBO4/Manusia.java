/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO4;

/**
 *
 * @author zara
 */
public class Manusia {
    private String nama; // Hanya bisa diakses dalam kelas (private)
    protected int usia;  // Bisa diakses dalam package dan subclass yang sama
    public String pekerjaan;  // Bisa diakses dari mana saja
    
    // Constructor untuk inisialisasi atribut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
    // Getter : Mengambbil nilai nama
    public String getNama() {
        return nama;
    }
    
    // Setter : Mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}

