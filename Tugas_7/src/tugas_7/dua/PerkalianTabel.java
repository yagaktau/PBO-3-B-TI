/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_7.dua;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class PerkalianTabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran tabel (1-10): ");
        int n = scanner.nextInt();

        if (n <= 10 && n > 0) {
            System.out.println();
            
            for (int i = 1; i <= n; i++) {
                System.out.print("\t" + i);
            }
            System.out.println();
            
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                
                for (int j = 1; j <= n; j++) {
                    System.out.print("\t" + (i * j));
                }
                System.out.println();
            }
        } else {
            System.out.println("Ukuran tabel harus antara 1-10.");
        }
        scanner.close();
    }    
}
