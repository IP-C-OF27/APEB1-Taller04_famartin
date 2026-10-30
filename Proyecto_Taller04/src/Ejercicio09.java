import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de
 * una persona estudiante en una asignatura universitaria a partir de una
 * calificación de evaluación continua, una calificación de examen final y un
 * porcentaje de asistencia. La regla institucional establece que:

La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar 
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
        if (asistencia >= 70){
            System.out.println("Cumple con la asistencia, ingrese la nota del examen final: ");
            examen = tcl.nextDouble();
            if ( examen > 8){
                System.out.println("Alcanzo la nota minima del examen ");
                total = (examen + evaluacion) / 2;
                System.out.println("Su nota final es: "+total);
            }
            else
                System.out.println("No cumple con la nota minima del examen final");}
        else
            System.out.println("No cumple con la asistencia minima para dar el examen");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */