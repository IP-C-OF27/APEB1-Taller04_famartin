import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double area, base, altura;
        System.out.println("Ingrese la altura del triangulo: ");
        altura = tcl.nextDouble();
        System.out.println("Ingrese la base del triangulo: ");
        base = tcl.nextDouble();
        area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 * run:
Ingrese la altura del triangulo: 
10
Ingrese la base del triangulo: 
20
El area del triangulo es: 100.0
BUILD SUCCESSFUL (total time: 4 seconds)

 */