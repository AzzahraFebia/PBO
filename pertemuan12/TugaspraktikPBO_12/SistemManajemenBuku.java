/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikPBO_12;

/**
 *
 * @author zara
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Buku yang dapat diserialisasi
class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Format penyimpanan untuk file teks
    @Override
    public String toString() {
        return judul + "," + pengarang + "," + tahunTerbit;
    }

    // Menampilkan detail buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }
}

// PROGRAM UTAMA
public class SistemManajemenBuku {
    // Nama file untuk menyimpan data
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.serial";

    // List buku disimpan sementara di memori
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Perulangan menu
        while (true) {
            System.out.println("\nMenu Sistem Manajemen Buku");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan Buku ke File Teks");
            System.out.println("3. Simpan Objek Buku ke File Serial");
            System.out.println("4. Tampilkan Buku dari File Teks");
            System.out.println("5. Tampilkan Buku dari File Serial");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = sc.nextInt();
            sc.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1 -> tambahBuku(sc);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanDariFileTeks();
                case 5 -> tampilkanDariFileSerial();
                case 6 -> {
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // 1. Tambah Buku
    private static void tambahBuku(Scanner sc) {
        System.out.print("Masukkan Judul Buku: ");
        String judul = sc.nextLine();

        System.out.print("Masukkan Nama Pengarang: ");
        String pengarang = sc.nextLine();

        System.out.print("Masukkan Tahun Terbit: ");
        int tahun = sc.nextInt();

        // Menambah ke list
        bukuList.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan!");
    }

    // 2. Simpan ke File Teks
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku b : bukuList) {
                writer.write(b.toString() + "\n"); // Tulis 1 buku per baris
            }
            System.out.println("Data buku berhasil disimpan ke file buku.txt");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
        }
    }

    // 3. Simpan Objek ke File Serial
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList); // Simpan seluruh list sebagai 1 objek
            System.out.println("Objek buku berhasil disimpan ke file buku.serial");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
        }
    }

    // 4. Tampilkan dari File Teks
    private static void tampilkanDariFileTeks() {
        System.out.println("\nIsi file buku.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) { // Baca baris per baris
                String[] data = line.split(",");         // Pisah dengan koma 
                Buku b = new Buku(data[0], data[1], Integer.parseInt(data[2]));
                b.tampilkanInfo();
            }
        } catch (IOException e) {
            System.out.println("Tidak dapat membaca file buku.txt");
        }
    }

    // 5. Tampilkan dari File Serial
    private static void tampilkanDariFileSerial() {
        System.out.println("\nIsi file buku.serial:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            
            // Baca sebagai objek list buku
            List<Buku> list = (List<Buku>) ois.readObject();

            for (Buku b : list) {
                b.tampilkanInfo();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak dapat membaca file buku.serial");
        }
    }
}

