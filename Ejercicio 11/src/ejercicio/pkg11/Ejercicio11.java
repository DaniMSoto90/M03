/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dibuja el ordinograma de un programa
        //que lee 2 números y muestra el mayor.
        //si son iguales, que lo muestre.
        int num1,num2;
        System.out.println("Introduce el primero numero");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        System.out.println("Introduce el segundo numero");
     
        num2= sc.nextInt();
      
        if (num1==num2) {
            System.out.println("Los numeros son iguales");
        }
        else if(num1>num2){
            System.out.println("El primer numero,"+num1+" es mas grande"+"que "+num2);
        }
        else{
            System.out.println("El segundo numero,"+num2+" es mas grande"+" que "+num1);}
        
        
    }
    
}
