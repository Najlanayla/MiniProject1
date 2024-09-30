/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siswaTK;

import java.util.ArrayList;

public class Siswa {
    public String namaSiswa;
    public String kelas;
    public int idSiswa;
    
    public static ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    
    public Siswa(String namaSiswa, String kelas, int idSiswa){
        this.namaSiswa = namaSiswa;
        this.kelas = kelas;
        this.idSiswa = idSiswa;
    }
    
    public void tampilkanSiswa(){
        String garis = "===============================================";
        System.out.println(garis);
        System.out.println("Nama Siswa: " + namaSiswa);
        System.out.println("Kelas     : " + kelas);
        System.out.println("ID Siswa  : " + idSiswa);
        System.out.println(garis);
    }
    
    public static void tambahSiswa(Siswa siswa){
        String garis = "===============================================";
        System.out.println(garis);
        if (siswa.namaSiswa.isEmpty() || siswa.kelas.isEmpty()) {
            System.out.println("Nama siswa atau kelas tidak boleh kosong.");
        } else {
            daftarSiswa.add(siswa);
            System.out.println("Siswa berhasil ditambahkan.");
        }
        System.out.println(garis);
    }
    
    public static void hapusSiswa(int idSiswa){
        String garis = "===============================================";
        System.out.println(garis);
        boolean siswaDihapus = daftarSiswa.removeIf(siswa -> siswa.idSiswa == idSiswa);
        if (siswaDihapus) {
            System.out.println("Siswa berhasil dihapus.");
        } else {
            System.out.println("Siswa dengan ID tersebut tidak ditemukan.");
        }
        System.out.println(garis);
    }
    
    public static void tampilkanSemuaSiswa(){
        String garis = "==============================================";
        System.out.println(garis);
        System.out.println("             DAFTAR SISWA TK                  ");
        System.out.println(garis);
        
        if (daftarSiswa.isEmpty()) {
            System.out.println("Daftar siswa kosong.");
        } else {
            for (Siswa siswa : daftarSiswa) {
                siswa.tampilkanSiswa();
            }
        }
        System.out.println(garis);
    }
}

