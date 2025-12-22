/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author zara
 */
// FILE I/O DAN EXCEPTION HANDLING
import java.io.*;

public class File {

    public static void simpanData(Perpustakaan p, String namaFile) {
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(namaFile))) {
            oos.writeObject(p);
            System.out.println("Data berhasil disimpan.");
        } catch (IOException e){
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    public static Perpustakaan bacaData(String namaFile) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(namaFile))) {
            return (Perpustakaan) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca data: " + e.getMessage());
            return null;
        }
    }
}

