/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg08;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
     */
    public static void main(String[] args) {
        int nota;
        System.out.println("Indicar la nota a validar");
        Scanner leer = new Scanner (System.in);
        nota = leer.nextInt();
        
        while (nota > 10 | nota < 0 ) {
            System.out.println("La nota es incorrecta, por favor ingresela nuevamente");
            nota = leer.nextInt();
        }
        
        if (nota <= 10 & nota >= 0) {
            System.out.println("La Nota es correcta");
        } 
        
        
        
    }
    
} 
