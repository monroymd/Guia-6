<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
* a e i o u
  @ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
     */
    public static void main(String[] args) {
        String frase;
        System.out.println("ingrese una frase");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.substring(i, i+1));
            
        }
        }
        
        
    

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
* a e i o u
  @ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
     */
    public static void main(String[] args) {
        String frase;
        System.out.println("ingrese una frase");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.substring(i, i+1));
            
        }
        }
        
        
    

>>>>>>> cd5f2a81a3ad2819b38ffd9ba43a6dab90821281
}