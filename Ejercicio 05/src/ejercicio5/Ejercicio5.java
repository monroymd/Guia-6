/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese verdadero o falso");
        boolean opcion = leer.nextBoolean();
        
        
        System.out.println("Ingrese un valor con decimales");
        double num = leer.nextDouble();
        
        System.out.println("Ingrese un caracter");
        char nombre = leer.next().charAt(0);
        
               
        System.out.print(num);
        System.out.print(nombre);
        System.out.print(opcion);
    }
    
}
