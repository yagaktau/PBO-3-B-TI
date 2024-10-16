/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_7;

/**
 *
 * @author Asus
 */
public class BilanganPrima {

    public static void main(String[] args) {
        System.out.println("Deret Bilangan Prima dari 0 sampai 20:");
        
        for (int a = 0; a <= 20; a++) {
            if (Prima(a)) {
                System.out.print(a + " ");
            }
        }
        
        System.out.println("\n\nDeret Bilangan Bukan Prima dari 0 sampai 20:");
        
        int b = 0;
        while (b <= 20) {
            if (!Prima(b)) {
                System.out.print(b + " ");
            }
            b++;
        }
        
        System.out.println("\n\nDeret Bilangan Prima dan Bukan Prima dengan do-while:");
        
        int c = 0;
        do {
            if (Prima(c)) {
                System.out.print(c + " (Prima) ");
            } else {
                System.out.print(c + " (Bukan Prima) ");
            }
            c++;
        } while (c <= 20);
    }

    public static boolean Prima(int nomor) {
        if (nomor <= 1) {
            return false;
        }
        for (int a = 2; a <= Math.sqrt(nomor); a++) {
            if (nomor % a == 0) {
                return false;
            }
        }
        return true;
    }
}
