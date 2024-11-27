/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_faishal;

/**
 *
 * @author Asus
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika2 mtk2 = new Matematika2();
        
        // Menampilkan hasil operasi matematika
        System.out.println("Pertambahan : 20 + 10 = " + mtk2.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + mtk2.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3 = " + mtk2.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2 = " + mtk2.pembagian(21, 2));
        System.out.println("Modulus     : 20 % 3 = " + mtk2.modulus(20, 3));
    }
    
}
