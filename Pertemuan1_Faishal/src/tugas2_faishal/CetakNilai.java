/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_faishal;

/**
 *
 * @author reizi
 */
public class CetakNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari class Nilai
        Nilai nilai = new Nilai();
        
        // Mengisi variabel dengan data
        nilai.nim          = "12345678";
        nilai.nama         = "Osas";
        nilai.nilaiAbsen   = 80;
        nilai.nilaiTugas   = 85;
        nilai.nilaiUTS     = 75;
        nilai.nilaiUAS     = 88;
        
        // Memanggil method untuk menghitung dan mencetak nilai
        nilai.hitungNilaiAkhir();
        nilai.cetakNilai();
    }
    
}
