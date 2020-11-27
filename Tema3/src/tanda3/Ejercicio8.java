/*
Programa: Ejercicio8. Programa que recibe un número por teclado, evalua si está entre 1 y10, y saca el resultado por pantalla
Entorno: num, numeros reales.
Algoritmo:
	Visualizar "Introduce un número entre 1 y 10"
	Leer num
	Comprobar si num está enre 1 y 10
	Visualizar "Es correcto" o "No es correcto"
Fin programa

 */
package tanda3;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.println("Introduce un número entre 1 y 10");
		num = teclado.nextInt();

		if (num >=0 && num <=10) {

			System.out.println("El número " + num +  " es correcto" );
			
		} else {
			System.out.println("El número " + num + " no es correcto");
		}
		teclado.close();
	}
}

