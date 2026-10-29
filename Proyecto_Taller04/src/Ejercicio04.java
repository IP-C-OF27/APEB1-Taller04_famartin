import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double costo_minuto, numero_minutos, total;
        System.out.println("Ingrese costo del telefono por minutos: ");
        costo_minuto = tcl.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos en el mes: ");
        numero_minutos = tcl.nextDouble();
        total = costo_minuto * numero_minutos;
        System.out.println("El precio de la planilla del mes es: "+ total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java4
 * run:
Ingrese costo del telefono por minutos: 
0,75
Ingrese el numero de minutos consumidos en el mes: 
124
El precio de la planilla del mes es: 93.0
BUILD SUCCESSFUL (total time: 10 seconds)

 */