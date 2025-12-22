/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author zara
 */
// ABSTRAKSI DAN KELAS ABSTRAK
// ABTSRACT CLASS
import java.io.Serializable;

public abstract class KoleksiPerpus implements Serializable { 
    protected String id;
    protected String judul;

    public KoleksiPerpus(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }
    
    public String getId() {
        return id;
    }

    public abstract void tampilInfo();
}

// KELAS TURUNAN
class Buku extends KoleksiPerpus {
    private String penulis;

    public Buku(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID: " + id + " || Buku: " + judul + " || Penulis: " + penulis);
    }
}