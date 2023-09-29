/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        double nota;
        System.out.println("INTRODUCE TU NOTA");
        nota= Scan.nextDouble();
        
        if (nota<0 || nota>10) {
            System.out.println("no es una nota valida");
        }
       
        else{
            if (nota<3) {
                System.out.println("Muy deficiente");
            }
            else if(nota>=3 && nota<5){
                System.out.println("Insuficiente");
            }
            else if(nota>=5 && nota<6){
                System.out.println("Bien");
            }
            else if(nota>=6 && nota<9){
                System.out.println("Notable");
            }
            else{
                System.out.println("Sobresaliente");}
        }
        
        
        
    }
    
}
