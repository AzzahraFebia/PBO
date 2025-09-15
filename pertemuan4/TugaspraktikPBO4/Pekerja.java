/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO4;

/**
 *
 * @author zara
 */
public class Pekerja extends Manusia {
    private int gaji; // Atribut tambahan khusus Pekerja
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor Manusia
        this.gaji = gaji;             // Inisialisasi atribut gaji
    }
    
    // Getter untuk gaji
    public int getGaji() {
        return gaji;
    }
    
    // Setter untuk gaji
    public void setGaji(int Gaji) {
        this.gaji = gaji;
    }
    
    // Override
    public String toString() {
        return "Nama : " + getNama() +
                "\nUsia : " + usia +
                "\nPekerjaan : " + pekerjaan +
                "\nGaji : Rp" + gaji;
    } 
}
