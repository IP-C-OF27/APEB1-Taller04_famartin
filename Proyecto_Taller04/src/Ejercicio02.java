import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double gasto1, gasto2, gasto3, gastototal;
        System.out.print("Ingrese los gastos: ");
        gasto1 = tcl.nextDouble();
        gasto2 = tcl.nextDouble();
        gasto3 = tcl.nextDouble();
        gastototal = gasto1 + gasto2 + gasto3 ;
        System.out.println("El total de gasto es: " + gastototal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 * run:
Ingrese los gastos: 20
30
40
El total de gasto es: 90.0
BUILD SUCCESSFUL (total time: 14 seconds)
 */