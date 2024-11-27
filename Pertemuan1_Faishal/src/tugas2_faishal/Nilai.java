/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_faishal;

/**
 *
 * @author reizi
 */
public class Nilai {
    // Variabel untuk menyimpan data nilai
    String nim;
    String nama;
    double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    // Method untuk menghitung nilai akhir
    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    
    // Method untuk mecetak hasil nilai
    void cetakNilai() {
        System.out.println("NIM              : " + nim);
        System.out.println("Nama             : " + nama);
        System.out.println("Nilai Absen [10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]: " + nilaiTugas);
        System.out.println("Nilai UTS   [30%]: " + nilaiUTS);
        System.out.println("Nilai UAS   [40%]: " + nilaiUAS);
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
    }
}
