/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author zara
 */
// Kelas Induk
class Kendaraan { 
    String nama;
    int kecepatan;
    
    // Metode menampilkan info
    public void tampilkanInfo(){
       System.out.println("Nama Kendaraan : " + nama); 
       System.out.println("Kecepatan : " + kecepatan + "km/jam");
    }
}

// Kelas Turunan Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}

// Kelas Turunan SepedaMotor
class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis Mesin : " + jenisMesin);
        
    }
}

// Program Utama
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
        
        // Menampilkan Informasi Mobil
        System.out.println("\n=== Informasi Mobil ===");
        mobil.tampilkanInfo();

        // Menampilkan Informasi Sepeda Motor
        System.out.println("\n=== Informasi Sepeda Motor ===");
        motor.tampilkanInfo();
    }
}
