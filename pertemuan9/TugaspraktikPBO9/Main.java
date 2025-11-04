/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO9;

/**
 *
 * @author zara
 */
// Kelas abstrak
abstract class Hewan {
    // Metode abstrak
    abstract void suara();
}

// Kelas Turunan
// Kucing
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara : Meong");
    }
}

// Anjing
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara : Guk Guk");
    }
}

// Class Main
public class Main {
        public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.suara();
        anjing.suara();
    }
}
