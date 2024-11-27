/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_faishal;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data Mahasiswa
        System.out.println("Masukkan NPM Mahasiswa: ");
        String npm = input.nextLine();
        
        System.out.println("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan Nilai Kehadiran: ");
        double kehadiran = input.nextDouble();
        
        System.out.println("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        
        System.out.println("Masukkan Nilai UTS: ");
        double UTS = input.nextDouble();
        
        System.out.println("Masukkan Nilai UAS: ");
        double UAS = input.nextDouble();
        
        //Perhitungan untuk Nilai Akhir
        double nilaiAkhir = (0.1 * kehadiran) + (0.2 * tugas) + (0.3 * UTS) + (0.4 * UAS);
        
        //Menentukan grade dan keterangan
        String grade, keterangan;
        if (nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "Kurang Sekali";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "Kurang";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "Cukup";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "Baik";
        } else {
            grade = "A";
            keterangan = "Istimewa";
        }
        
        //Output data
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan Grade: " + keterangan);
    }
    
}
