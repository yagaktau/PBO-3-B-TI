/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_7;

/**
 *
 * @author Asus
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Deret Bilangan Ganjil dari 0 sampai 20:");       
       for (int d = 0; d <= 20; d++){
           if (d % 2 == 0){
               System.out.println(d + " ");
           }
       }
       
       System.out.println("\nDeret Bilangan Genap dari 0 sampai 20:");       
       int e = 0;
       while (e <= 20){
           if (e % 2 !=0){
               System.out.println(e + " ");
           }
           e++;
       }
       
       System.out.println("\nDeret Bilangan Ganjil untuk (0-20) dengan do-while:");       
       int f = 0;
       do{
           if (f % 2 == 0){
               System.out.print(f + " ");
           }
           f++;
       }while (f <= 20);
       
       System.out.println("\n\nDeret Bilangan Genap untuk (0-20) dengan do-while:");
       int g = 0;
       do{
           if (g % 2 != 0){
               System.out.print(g + " ");
           }
           g++;
       }while (g <= 20);
    }
    
}
