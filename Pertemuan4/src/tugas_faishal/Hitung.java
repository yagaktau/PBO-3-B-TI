/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_faishal;

/**
 *
 * @author Asus
 */
public class Hitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Balok dan Kubus
        OperasiPerhitungan RumusBalok = new RumusBalok(7, 5, 4);    //Panjang 7, Lebar 5, Tinggi 4
        OperasiPerhitungan RumusKubus = new RumusKubus(5);           //Sisi 6
                
        System.out.println("Balok: ");
        System.out.println("Volume Balok: " + RumusBalok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + RumusBalok.hitungLuasPermukaan());
        
        System.out.println("Kubus: ");
        System.out.println("Volume Kubus: " + RumusKubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + RumusKubus.hitungLuasPermukaan());
    }
    
}
