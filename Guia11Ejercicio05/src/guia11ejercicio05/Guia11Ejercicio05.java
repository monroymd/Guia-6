
/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia11ejercicio05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guia11Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(500) + 1;

        adivinarNumero(num);
    }

    public static void adivinarNumero(int num) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int cont = 0;
        System.out.println(num);
        do {
            try {
                System.out.println("Ingrese el numero a adivinar");
                opcion = leer.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un numero");
                leer.next();
            }

            cont += 1;
            if (opcion < num) {
                System.out.println("El numero es mayor");
            } else if (opcion > num) {
                System.out.println("El numero es menor");
            }
        } while (opcion != num);

    }

}
