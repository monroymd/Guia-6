/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
     * 
     */
    public static void main(String[] args) {
        
        int num, num1, num2, num3, num4, contador = 4;
        
               
        do {
            System.out.println("Indique un numero entre 0 y 20 de " + contador);
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            
        } while (num > 20 || num <= 0);
        
            num1 = num;
            contador -= 1;
         do {
            System.out.println("Indique un numero entre 0 y 20 de " + contador);
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            
        } while (num > 20 || num <= 0);
        
            num2 = num;
            contador -= 1;
            
             do {
            System.out.println("Indique un numero entre 0 y 20 de " + contador);
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            
        } while (num > 20 || num <= 0);
        
            num3 = num;
            contador -= 1;
             do {
            System.out.println("Indique un numero entre 0 y 20 de " + contador);
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            
        } while (num > 20 || num <= 0);
        
            num4 = num;
            contador -= 1;
            
        System.out.print(num1 + ":");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        System.out.print(num2 + ":");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num3 + ":");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        System.out.print(num4 + ":");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
        } 
    }
    

