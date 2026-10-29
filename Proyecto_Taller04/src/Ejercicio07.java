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
        double kv_precio, kv_consumido, total,total_descuento;
        double descuento = 0.10;
        int edad;
        System.out.println("Ingrese el valor del kilovatio/hora: ");
        kv_precio = tcl.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos en el mes:");
        kv_consumido = tcl.nextDouble();
        System.out.println("Ingrese su edad:");
        edad = tcl.nextInt();
        if (edad >= 65){
            total= kv_precio * kv_consumido;
            total_descuento= total * descuento;
            total_descuento = total - total_descuento;
            System.out.println("El total a pagar con descuento es: "+total);}
        else{
            total= kv_precio * kv_consumido;
            System.out.println("El total a pagar es: "+total);
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */