/*
Programa: Ejercicio 6. Programa que lee el nombre y las notas de un alumno por teclado y presenta la nota final por pantalla.
Entorno: nombre, nota1, nota2, nota 3, notafin. Cadenas de caracteres y números reales.
Algoritmo:
	Visualizar "Introduce el nombre de un alumno"
	Leer nombre
	Visualizar "Introduce la nota de la primera evaluación"
	Leer nota1
	Visualizar "Introduce la nota de la segunda evalluación"
	Leer nota2
	Visualizar "Introduce la nota de la tercera evaluación"
	Leer nota 3
	Calcular nota final (media de las evaluaciones)
	Visualizar "La nota final del alumno es " notafin
Fin programa
*/
package tanda2;
import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int nota1;
		int nota2;
		int nota3;
		double notafin;
		
		System.out.println("Introduce el nombre de un alumno");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce la nota de la primera evaluación");
		nota1 = teclado.nextInt();
		
		System.out.println("Introduce la nota de la segunda evalluación");
		nota2 = teclado.nextInt();
		
		System.out.println("Introduce la nota de la tercera evaluación");
		nota3 = teclado.nextInt();
		
		notafin = Math.round((nota1 + nota2 + nota3)/3);
		
		System.out.println("La nota final del alumno" + nombre + " es" + notafin);
		
		teclado.close();

	}

}
