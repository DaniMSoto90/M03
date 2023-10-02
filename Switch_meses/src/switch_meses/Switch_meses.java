/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_meses;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class Switch_meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la letra del mes");
        char letra = sc.next().charAt(0);
        
        
        switch (letra) {
            
                case 'e':
                case 'E':    
                System.out.println("Enero");
                break;
                
                case 'f':
                case 'F':
                System.out.println("Febrero");
                break;
                
                case 'm':
                case 'M':
                System.out.println("Marzo");
                break;
             
                case 'a':
                case 'A':
                System.out.println("Abril");
                break;
                
                 default:
                System.out.println("mes no valido");
        }
        
        
     
    }
    
}
