import java.util.Scanner;
/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la 
 * tabla de multiplicar de un número ingresado por el usuario; solo en el caso 
 * que el valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese la tabla de multiplicar que desea entre 2 y 6:");
        numero = tcl.nextInt();
        if (numero>=2 && numero<=6){
            System.out.println(numero + " x 1 = " + (numero * 1));
            System.out.println(numero + " x 1 = " + (numero * 2));
            System.out.println(numero + " x 1 = " + (numero * 3));
            System.out.println(numero + " x 1 = " + (numero * 4));
            System.out.println(numero + " x 1 = " + (numero * 5));
            System.out.println(numero + " x 1 = " + (numero * 6));
            System.out.println(numero + " x 1 = " + (numero * 7));
            System.out.println(numero + " x 1 = " + (numero * 8));
            System.out.println(numero + " x 1 = " + (numero * 9));
            System.out.println(numero + " x 1 = " + (numero * 10));
            System.out.println(numero + " x 1 = " + (numero * 11));
            System.out.println(numero + " x 1 = " + (numero * 12));
        }
        else
            System.out.println("El numero tiene q estar entre 2 y 6");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 * run:
Ingrese la tabla de multiplicar que desea entre 2 y 6:5
5 x 1 = 5
5 x 1 = 10
5 x 1 = 15
5 x 1 = 20
5 x 1 = 25
5 x 1 = 30
5 x 1 = 35
5 x 1 = 40
5 x 1 = 45
5 x 1 = 50
5 x 1 = 55
5 x 1 = 60
BUILD SUCCESSFUL (total time: 3 seconds)

 */