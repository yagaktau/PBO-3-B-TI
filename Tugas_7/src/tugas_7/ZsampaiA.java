/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_7;

/**
 *
 * @author Asus
 */
public class ZsampaiA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ZsampaiA for:");
        for (char huruffor = 'Z'; huruffor >= 'A'; huruffor--){
            System.out.print(huruffor + " ");
        }
        
        System.out.println("\nZsampaiA while:");
        char hurufwhile = 'Z';
        while (hurufwhile >= 'A'){
            System.out.print (hurufwhile + " ");
            hurufwhile--;
        }
        
        System.out.println("\nZsampaiA do-while:");
        char hurufdowhile = 'Z';
        do{
            System.out.print(hurufdowhile + " ");
            hurufdowhile--;
        }while (hurufdowhile >= 'A');
    }
    
}
