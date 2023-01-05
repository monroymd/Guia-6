/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg09;

import java.util.Scanner;

/**
 * 
 * @author Mario
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        int num, suma = 0;
        int var = 20;
        
        do {
            if (var > 1) {
            System.out.println("Por favor, ingrese un numero, tiene " + var + " opciones");
            Scanner leer = new Scanner (System.in);
            num = leer.nextInt();
            
            if (num == 0) {
                System.out.println("Se capturo el numero cero!");
                break;
            } else if (num > 0) {
                var -= 1;
                suma += num;
            }
            if (var == 1) {
                System.out.println("Es tu ultima oportunidad");
                num = leer.nextInt();
                suma += num;
                var -= 1;
            }
            if (num < 0) {
                System.out.println("Por favor ingrese un valor positivo");
            }    
            }
        
        } while (var > 0 );
        
        System.out.println("La suma de los numeros indicados obtiene un total de: " + suma);
        
    }
    
}
