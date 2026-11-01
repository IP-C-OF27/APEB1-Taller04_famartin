import java.util.Scanner;
/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor
 * a cancelar de una planilla de luz. Se debe ingresar el valor de costo por
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * 
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio07 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double kv_precio, kv_consumido, total;
        double descuento = 0.10;
        int edad;
        System.out.println("Ingrese el valor del kilovatio/hora: ");
        kv_precio = tcl.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos en el mes:");
        kv_consumido = tcl.nextDouble();
        System.out.println("Ingrese su edad:");
        edad = tcl.nextInt();
        if (edad > 65){
            total= kv_precio * kv_consumido;
            total= total -(total * descuento);
            System.out.println("El total a pagar con descuento del 10% es: "+total);}
        else{
            total= kv_precio * kv_consumido;
            System.out.println("El total a pagar es: "+ total);
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 * run:
Ingrese el valor del kilovatio/hora: 
0,15
Ingrese el numero de kilovatios consumidos en el mes:
90
Ingrese su edad:
80
El total a pagar con descuento del 10% es: 12.15
BUILD SUCCESSFUL (total time: 6 seconds)
 */