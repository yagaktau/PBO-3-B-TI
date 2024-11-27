/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3_faishal;

/**
 *
 * @author reizi
 */
public class LaguBingo {
    String clap;

    public LaguBingo(String clap){
        this.clap = clap;
    }
    
    public void clap (){
        for (int k = 0; k <= 5; k++){
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for (int l = 0; l < 3; l++ ){
                if(k<=0){
                    System.out.println("B-I-N-G-O");
                }else if(k<=1){
                    System.out.println(clap+"-"+"I-N-G-O");
                }else if(k<=2){
                    System.out.println(clap+"-"+clap+"-"+"N-G-O");
                }else if(k<=3){
                    System.out.println(clap+"-"+clap+"-"+clap+"-"+"G-O");
                }else if(k<=4){
                    System.out.println(clap+"-"+clap+"-"+clap+"-"+clap+"-"+"O");
                }else{
                    System.out.println(clap+"-"+clap+"-"+clap+"-"+clap+"-"+clap); 
                }
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}
