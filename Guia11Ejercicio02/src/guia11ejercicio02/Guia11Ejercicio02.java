
/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package guia11ejercicio02;

public class Guia11Ejercicio02 {

    public static void main(String[] args) {

        int[] lista = new int[3];
        try {
            for (int i = 0; i < 10; i++) {
                lista[i] = 1;
                System.out.println((i+1)+" = "+lista[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("La lista se encuentra fuera del rango");
        }
    }

}
