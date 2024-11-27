/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_faishal;

/**
 *
 * @author Asus
 */
class RumusKubus extends OperasiPerhitungan{
    double sisi;
    
    RumusKubus(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }
    
    @Override
    double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}
