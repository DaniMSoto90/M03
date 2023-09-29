/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_2;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class Ejercicio15_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scan = new Scanner(System.in);
        
        int num1,num2,num3;
        
        System.out.println("Introduce el primer numero");
        num1= Scan.nextInt();
        System.out.println("Introduce el segundo numero");
        num2= Scan.nextInt();
        System.out.println("Introduce el tercer numero");
        num3= Scan.nextInt();
        
        if (num1>num2 && num1>num3) {
            System.out.println("El  primero numero, ("+num1+") es el mayor");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("El segundo numero,("+num2+")es el mayor");
        }
        else{
            System.out.println("El tercer numero,("+num3+")es el mayor");
        }
       
        
        
    }
    
}

