/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author zara
 */
// PERCOBAAN OVERRIDING
class Kucing extends Hewan {
    @Override
    
    public void bersuara() {
      System.out.println("Meow");
    }
}

class Anjing extends Hewan {
 @Override
 public void bersuara() {
 System.out.println("Woof");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output : Meow
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
 
        Anjing anjing = new Anjing();
        anjing.bersuara(); // Output: Woof
        anjing.makan("daging", 3); // Memanggil metode akan() yang overloaded pada kelas Hewan
    }
}






