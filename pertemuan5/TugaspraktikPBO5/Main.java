/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO5;

/**
 *
 * @author zara
 */
// Kelas Induk
class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis Hewan : " + jenis);
    }
}

// Kelas Turunan Kucing
class Kucing extends Hewan {
    String suara = "Miaw";
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara : " + suara);
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    String suara = "Guk-Guk";
 
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara : " + suara);
    }
}

// HIERARKI PEWARISAN

// Kelas Induk
class Kendaraan {
    String nama;
    int kecepatan;
    
     public void tampilkanInfo() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }
}

// Kelas Menengah (KendaraanDarat)
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda : " + jumlahRoda);
    }
}

// Kelas Turunan Mobil 
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}

// Kelas Turunan Sepeda Motor
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
}

// Program Utama
public class Main {
    public static void main(String[] args){
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing";
        kucing.jenis = "Anggora";
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Anjing";
        anjing.jenis = "Maltese";
        anjing.tampilkanInfo();
        
        System.out.println("\n=== HIERARKI PEWARISAN KENDARAAN ===");
        
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
    }
}
