/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first_var;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class First_var {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  el usuario introduce el valor
        */
        
        System.out.println("Que nota crees que sacaras en MO1");
        Scanner pantalla = new Scanner(System.in);
        int nota1= pantalla.nextInt();
        System.out.println("la nota de MO1 es " +nota1);
        //MO2
        
        System.out.println("Que nota crees que sacaras en MO2");
        Scanner pantalla2 = new Scanner(System.in);
        int nota2= pantalla2.nextInt();
        System.out.println("la nota de MO2 es " +nota2);
        
        //MO3
        
        System.out.println("Que nota crees que sacaras en MO3");
        Scanner pantalla3 = new Scanner(System.in);
        int nota3= pantalla3.nextInt();
        System.out.println("la nota de MO3 es " +nota3);
        
      //  System.out.println("la nota del MO2 2 es " +nota2);
      //  System.out.println("la nota del MO3 es " +nota3);
        
    
    }
    
}
