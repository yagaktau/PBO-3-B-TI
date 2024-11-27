/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_faishal;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class DiskonPembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input total pembelian
        System.out.println("Masukkan Total Pembelian: ");
        double totalPembelian = input.nextDouble();
        
        //Menentukan besarnya diskon
        double diskon;
        if (totalPembelian >= 50000) {
            diskon = 0.2 * totalPembelian; //Dsikon 20% untuk > 50000
        } else {
            diskon = 0.05 * totalPembelian; //Diskon 5% untuk < 50000
        }
        
        //Menghitung total
        double totalBayar = totalPembelian - diskon;
        
        //Output hasil perhitungan
        System.out.println("Rincian Pembelian: ");
        System.out.println("Total Pembelian: " + totalPembelian);
        System.out.println("Besar Diskon: " + diskon);
        System.out.println("Jumlah yang dibayar: " + totalBayar);
    }
}
