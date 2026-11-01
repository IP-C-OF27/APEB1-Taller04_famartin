    import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de
 * una persona estudiante en una asignatura universitaria a partir de una
 * calificación de evaluación continua, una calificación de examen final y un
 * porcentaje de asistencia.
 * La salida debe indicar Aprobado, Supletorio o Reprobado, y mostrar
 * la nota final redondeada a un decimal."
 * @author Felipe Martin
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double evaluacion, examen, total;
        int asistencia;
        System.out.println("Ingrese el porcentaje de asistencia: ");
        asistencia = tcl.nextInt();
        System.out.println("Ingrese la nota de la evaluacion continua: ");
        evaluacion = tcl.nextDouble();
        System.out.println("Ingrese la nota del examen final: ");
        examen = tcl.nextDouble();
        total = (examen + evaluacion) / 2;
        if (asistencia >= 70) {
            if (examen >= 7 && total >= 7) {
                System.out.println("Aprobado");
            } else if (total >= 6) {
                System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }
        } else {
            System.out.println("Reprobado por falta de asistencia");
        }
        System.out.printf("Su nota final es: %.1f%n", total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 *  run:
Ingrese el porcentaje de asistencia: 
80
Ingrese la nota de la evaluacion continua: 
7
Ingrese la nota del examen final: 
10
Aprobado
Su nota final es: 8.5BUILD SUCCESSFUL (total time: 4 seconds)

 */