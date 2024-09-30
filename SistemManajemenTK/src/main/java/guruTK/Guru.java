/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guruTK;

import java.util.ArrayList;

public class Guru {
    public String nama;
    public int idGuru;
    public String mataPelajaran;
    
    public static ArrayList<Guru> daftarGuru = new ArrayList<>();
    
    public Guru(String nama, int idGuru, String mataPelajaran) {
        this.nama = nama;
        this.idGuru = idGuru;
        this.mataPelajaran = mataPelajaran;
    }
    
    public void tampilkanGuru() {
        String garis = "===============================================";
        System.out.println(garis);
        System.out.println("Nama Guru     : " + nama);
        System.out.println("ID Guru       : " + idGuru);
        System.out.println("Mata Pelajaran: " + mataPelajaran);
        System.out.println(garis);
    }
    
    public static void tambahGuru(Guru guru){
        String garis = "===============================================";
        System.out.println(garis);
        if (guru.nama.isEmpty() || guru.mataPelajaran.isEmpty()) {
            System.out.println("Nama guru atau mata pelajaran tidak boleh kosong.");
        } else {
            daftarGuru.add(guru);
            System.out.println("Guru berhasil ditambahkan.");
        }
        System.out.println(garis);
    }
    
    public static void hapusGuru(int idGuru) {
        String garis = "===============================================";
        System.out.println(garis);
        boolean guruDihapus = daftarGuru.removeIf(guru -> guru.idGuru == idGuru);
        if (guruDihapus) {
            System.out.println("Guru berhasil dihapus.");
        } else {
            System.out.println("Guru dengan ID tersebut tidak ditemukan.");
        }
        System.out.println(garis);
    }
    
    public static void tampilkanSemuaGuru(){
        String garis = "==============================================";
        System.out.println(garis);
        System.out.println("              DAFTAR GURU TK                  ");
        System.out.println(garis);
        
        if (daftarGuru.isEmpty()) {
            System.out.println("Daftar guru kosong.");
        } else {
            for (Guru guru : daftarGuru) {
                guru.tampilkanGuru();
            }
        }
        System.out.println(garis);
    }
}

