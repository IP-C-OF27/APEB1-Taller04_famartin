import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura 
 * se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. 
 * Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula 
* multiplicando su base por su altura; el área de un triángulo rectángulo se 
* calcula multiplicando su base por su altura, y luego dividiendo el resultado 
* entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado 
* la medida de uno de sus lados."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double triangulo, rectangulo,cuadrado, base, altura, total_poligono;
        System.out.println("Ingrese la base del cuadrado: ");
        base = tcl.nextDouble();
        System.out.println("Ingrese la altura de un triangulo: ");
        altura = tcl.nextDouble();
        cuadrado = base * base ;
        rectangulo = base * altura;
        triangulo = ( base * altura )/2;
        total_poligono = cuadrado + rectangulo + (triangulo * 3);
        System.out.println("El area total del poligono es: "+total_poligono);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 * run:
Ingrese la base del cuadrado: 
10
Ingrese la altura de un triangulo: 
5
El area total del poligono es: 225.0
BUILD SUCCESSFUL (total time: 5 seconds)

 */