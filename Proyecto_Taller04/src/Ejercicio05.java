import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU,
 * teclado, pantalla, ratón."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double cpu, teclado, pantalla, raton, total;
        System.out.println("Ingrese el precio de el cpu:");
        cpu = tcl.nextDouble();
        System.out.println("Ingrese el precio de el teclado:");
        teclado = tcl.nextDouble();
        System.out.println("Ingrese el precio de el pantalla:");
        pantalla = tcl.nextDouble();
        System.out.println("Ingrese el precio de el raton:");
        raton = tcl.nextDouble();
        total = cpu + teclado + pantalla + raton;
        System.out.println("El total a pagar es: "+ total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 * run:
Ingrese el precio de el cpu:
200
Ingrese el precio de el teclado:
40
Ingrese el precio de el pantalla:
89
Ingrese el precio de el raton:
30
El total a pagar es: 359.0
BUILD SUCCESSFUL (total time: 16 seconds)

 */