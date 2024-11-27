/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_faishal;

/**
 *
 * @author Asus
 */
public class KonversiSuhu2 extends KonversiSuhu {
    // Method tambahan untuk mengkonversi Fahrengeit ke Reamur
    public double FahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4 / 9;
    }
}
