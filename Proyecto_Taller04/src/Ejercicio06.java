import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un solución que permita calcular y mostrar el pago
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del
 * préstamo y el interés mensual a cobrar."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double interes, monto, pago_mes;
        System.out.println("Ingrese el monto del prestamo: ");
        monto = tcl.nextDouble();
        System.out.println("Ingrese el interes mensual del prestamo: ");
        interes = tcl.nextDouble();
        pago_mes = (monto/12) + (monto * interes / 100);
        System.out.println("El pago mensual es: "+pago_mes);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 * run:
Ingrese el monto del prestamo: 
1200
Ingrese el interes mensual del prestamo: 
5
El pago mensual es: 160.0
BUILD SUCCESSFUL (total time: 5 seconds)

 */