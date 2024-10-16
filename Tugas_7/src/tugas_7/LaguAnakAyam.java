/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_7;

/**
 *
 * @author Asus
 */
public class LaguAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 1;
        int n = 6;
        
            System.out.println("Lirik Lagu 'Anak Ayam'");
            
            do{
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println("Anak ayam turunlah " + n);
                n--;
                System.out.println("Pergi " + a + " tinggallah " + n);
            }while (n > 1);
        
            while (n == 1){
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println("Anak ayam turunlah " + n);
                n--;
                System.out.println("Pergi " + a + " tinggal induknya");
            }
    }
}
