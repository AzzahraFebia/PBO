/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author zara
 */
// KELAS MAIN
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        TransaksiPinjam transaksi = new TransaksiPinjam();

        int pilihan;

        do {
            System.out.println("\n=== PERPUSTAKAAN ===");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Daftar Anggota");
            System.out.println("4. Daftar Buku");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Simpan Data");
            System.out.println("7. Baca Data");
            System.out.println("8. Keluar");
            System.out.print("Pilih: ");

            try {
                pilihan = input.nextInt();
                input.nextLine(); // buang newline

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nama anggota: ");
                        String nama = input.nextLine();
                        perpustakaan.tambahAnggota(new Anggota(nama));
                        System.out.println("Anggota berhasil ditambahkan.");
                        break;

                    case 2:
                        System.out.print("ID Buku: ");
                        String id = input.nextLine();

                        System.out.print("Judul Buku: ");
                        String judul = input.nextLine();

                        System.out.print("Penulis: ");
                        String penulis = input.nextLine();
        
                        Buku buku = new Buku(id, judul, penulis);
                        perpustakaan.tambahBuku(buku); 
                        System.out.println("Buku berhasil ditambahkan.");
                        break;

                    case 3:
                        perpustakaan.tampilAnggota();
                        break;

                    case 4:
                        perpustakaan.tampilBuku();
                        break;

                    case 5:
                        perpustakaan.tampilBuku();
                        System.out.print("Masukkan ID Buku yang dipinjam: ");
                        String idPinjam = input.nextLine();

                        Buku bukuPinjam = perpustakaan.cariBukuId(idPinjam);

                        if (bukuPinjam != null) {
                            transaksi.tambahBuku(bukuPinjam);
                            transaksi.pinjam();
                        } else {
                            System.out.println("Buku tidak ditemukan.");
                        }
                        break;

                    case 6:
                        File.simpanData(perpustakaan, "perpustakaan.data");
                        break;

                    case 7:
                        Perpustakaan dataBaca = File.bacaData("perpustakaan.data");
                        if (dataBaca != null) {
                            dataBaca.tampilAnggota();
                            dataBaca.tampilBuku();
                        }
                        break;
                    case 8:
                        System.out.println("Terima kasih.");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak valid.");
                }

            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine(); // bersihin input error
                pilihan = -1;
            }

        } while (pilihan != 8);

        input.close();
    }
}


