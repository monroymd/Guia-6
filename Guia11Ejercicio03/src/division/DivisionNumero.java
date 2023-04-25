package division;
/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
*/

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;

public class DivisionNumero {

    public static void dividir(String a, String b) {

        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            
            System.out.println("la division de "+num1+" por "+num2+" es: "+num1/num2);

        } catch (InputMismatchException | ArithmeticException | NumberFormatException e) {
            System.out.println("Error");
            System.out.println(e.getCause());
            System.out.println(e.getCause());
        } catch (Exception e){
            System.out.println("Deja de ingresar huevadas");
        }
    }

}
