/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author zara
 */
// PERCOBAAN OVERLOADING
class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void makan (String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    
    public void makan (String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.bersuara(); // Output : Hewan bersuara
        kucing.makan("ikan"); // Memanggil metode makan() dari class hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang di overloaded
    }
}

