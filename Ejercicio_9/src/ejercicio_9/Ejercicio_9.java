/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad= sc.nextInt();
        if(edad<=0){
            System.out.println("La edad no es valida");}
        else{
        if (edad>=18) {
            System.out.println("Tienes "+edad+", eres mayor de edad");
        }
        else{ System.out.println("Tienes "+edad+", eres menor de edad");
        }
        }
    }
}
