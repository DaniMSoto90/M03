/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author dama0501
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
      
       double sueldo_normal, sueldo_total=0, sueldo_extra, h_normales=35, h_extra, tarifa_normal=20, sueldo_con_impuestos, impuesto;
       double tarifa_extra = tarifa_normal * 1.5;
       final int salario_sin_impuestos =500;
       
       
       
        System.out.println("Cuantas horas has trabajado?");
       int h_trabajadas= sc.nextInt();
        
        
        if (h_trabajadas <=35) {
            sueldo_total= h_trabajadas *tarifa_normal;
        }
        else if(h_trabajadas>35){
             h_extra = h_trabajadas - h_normales;
            
            sueldo_normal = h_normales * tarifa_normal;
            sueldo_extra = h_extra*tarifa_extra;
            
            sueldo_total= sueldo_normal + sueldo_extra;
            
        }
        
        if (sueldo_total<=salario_sin_impuestos) {
            System.out.println("tu sueldo esta libre de impuestos, y es "+sueldo_total+" euros");
        }
        
        else if(sueldo_total>salario_sin_impuestos){
            
        sueldo_con_impuestos= sueldo_total - salario_sin_impuestos;
        impuesto= sueldo_con_impuestos/100*25;
        sueldo_total= sueldo_total -impuesto;
        
        
        System.out.println("tu sueldo con impuestos  es "+sueldo_total+" euros"+" tus impuestos son "+impuesto);
         
        }
        
        
   

        
        
    }
    
}
