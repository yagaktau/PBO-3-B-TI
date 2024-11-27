/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_faishal;

/**
 *
 * @author Asus
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonversiSuhu2 suhu = new KonversiSuhu2();
        
        //Menggunakan method dari class KonversiSuhu
        double fahrenheit = suhu.CelciusToFahrenheit(25);           // Celcius ke Fahrenheit
        double reamur = suhu.CelciusToFahrenheit(25);               // Celcis ke Reamur
        double reamurfromfahrenheit = suhu.FahrenheitToReamur(77);  // Fahrenheit ke Reamur
        
        // Menampilkan hasil konversi
        System.out.println("Celcius ke Fahrenheit: 25 C = " + fahrenheit + " F");
        System.out.println("Celcius ke Reamur: 25 C = " + reamur + " Reamur");
        System.out.println("Fahrenheit ke Reamur : 77 F = " + reamurfromfahrenheit + " Reamur");
    }
    
}
