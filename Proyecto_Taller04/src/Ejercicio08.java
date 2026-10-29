import java.util.Scanner;
/**
 * Ejercicio 01: "Se debe generar una solución que permita calcular y mostrar 
 * el valor total a pagar mensual de servicios digitales de una persona. 
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double netflix, youtube, dropbox, spotify, total, descuento, total_descuento;
        descuento = 0.20;
        int edad;
        System.out.println("Ingrese el pago de netflix: ");
        netflix = tcl.nextDouble();
        System.out.println("Ingrese el pago de Youtube Premium: ");
        youtube = tcl.nextDouble();
        System.out.println("Ingrese el pago de Dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.println("Ingrese el pago de spotify: ");
        spotify = tcl.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad<30){
            total = netflix + youtube + dropbox + spotify;
            total_descuento = total * descuento;
            total_descuento = total - total_descuento;
            System.out.println("El total con el 20% de descuento es: "+total_descuento);
        }
        else{
            total = netflix + youtube + dropbox + spotify;
            System.out.println("El total con el 20% de descuento es: "+total);
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */