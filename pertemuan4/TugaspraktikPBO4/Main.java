/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO4;

/**
 *
 * @author zara
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Wooya", 26, "Software Engineer", 80000000);
        
        // Menampilkan informasi pekerja menggunakan toString()
        System.out.println(" --- Informasi Pekerja ---");
        System.out.println(pekerja1.toString());
        
        // Mengubah nama menggunakan Setter
        pekerja1.setNama("Wila");
        System.out.println("\n --- Setelah Nama Diubah ---");
        System.out.println(pekerja1.toString());
        
        // Mencoba akses langsung ke atribut
        System.out.println("\n --- Akses Langsung ---");
        System.out.println(pekerja1.getNama());  // Bisa dengan getNama
        System.out.println(pekerja1.usia);  // Bisa, karena protected
        System.out.println(pekerja1.pekerjaan);// Bisa, karena public
        System.out.println(pekerja1.getGaji());  // Bisa dengan getGaji
    }
}
