/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainTK;

import guruTK.Guru;
import siswaTK.Siswa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String garis = "==============================================";
        
        while (true) {
            System.out.println("\n" + garis);
            System.out.println("       SISTEM MANAJEMEN TAMAN KANAK-KANAK      ");
            System.out.println(garis);
            System.out.println("1. Tambah Data Guru");
            System.out.println("2. Tampilkan Semua Data Guru");
            System.out.println("3. Hapus Data Guru");
            System.out.println("4. Tambah Data Siswa");
            System.out.println("5. Tampilkan Semua Data Siswa");
            System.out.println("6. Hapus Data Siswa");
            System.out.println("7. Keluar");
            System.out.println(garis);
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println(garis); 
            if (pilihan == 1) {
                System.out.print("Nama Guru: ");
                String nama = scanner.nextLine();
                System.out.print("ID Guru: ");
                int idGuru = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Mata Pelajaran: ");
                String mataPelajaran = scanner.nextLine();
                Guru guru = new Guru(nama, idGuru, mataPelajaran);
                Guru.tambahGuru(guru);
            } else if (pilihan == 2) {
                System.out.println("DAFTAR GURU");
                Guru.tampilkanSemuaGuru();
            } else if (pilihan == 3) {
                System.out.print("ID Guru yang ingin dihapus: ");
                int idGuru = scanner.nextInt();
                scanner.nextLine(); 
                Guru.hapusGuru(idGuru);
            } else if (pilihan == 4) {
                System.out.print("Nama Siswa: ");
                String namaSiswa = scanner.nextLine();
                System.out.print("Kelas: ");
                String kelas = scanner.nextLine();
                System.out.print("ID Siswa: ");
                int idSiswa = scanner.nextInt();
                scanner.nextLine(); 
                Siswa siswa = new Siswa(namaSiswa, kelas, idSiswa);
                Siswa.tambahSiswa(siswa);
            } else if (pilihan == 5) {
                System.out.println("DAFTAR SISWA");
                Siswa.tampilkanSemuaSiswa();
            } else if (pilihan == 6) {
                System.out.print("ID Siswa yang ingin dihapus: ");
                int idSiswa = scanner.nextInt();
                scanner.nextLine(); 
                Siswa.hapusSiswa(idSiswa);
            } else if (pilihan == 7) {
                System.out.println("Terima kasih telah menggunakan Sistem Manajemen TK.");
                System.out.println(garis);
                break; 
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println(garis); 
        }
    }
}
