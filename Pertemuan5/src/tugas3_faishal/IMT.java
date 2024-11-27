/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3_faishal;


import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class IMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input BB dan TB
        System.out.println("Masukkan Berat Badan (kg): ");
        double bb = input.nextDouble();
        System.out.println("Masukkan Tinggi Badan (cm): ");
        double tb = input.nextDouble();
        
        //Perhitungan IMT
        double imt = bb / ((tb / 100) * (tb / 100));
        
        //Menentukan kriteria IMT
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            kriteria =  "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
        
        //Output hasil
        System.out.println("Hasil Perhitungan IMT ");
        System.out.println("IMT Anda    : " + imt);
        System.out.println("Kriteria    : " + kriteria);
    }
    
}
