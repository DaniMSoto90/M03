/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_new;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class Ejercicio3_new {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cuanto mide el lado del cuadrado");
        int lado,area;
       
        Scanner ladoscaner = new Scanner(System.in);
     
        lado=ladoscaner.nextInt();
            area= lado*lado;
                System.out.println("El area de un cuadrado de lado "+lado +" es "+area);
    }
    
}
