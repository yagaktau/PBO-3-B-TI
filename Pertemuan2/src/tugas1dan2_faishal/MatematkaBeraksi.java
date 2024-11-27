/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1dan2_faishal;

/**
 *
 * @author reizi
 */
public class MatematkaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari class Matematika
        Matematika mtk = new Matematika();
        
        // Menampilkan hasil operasi matematika
        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3 = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2 = " + mtk.pembagian(21, 2));
    }
    
}
