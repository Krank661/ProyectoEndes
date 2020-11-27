/*
Programa: Ejercicio8. Programa que recibe un n�mero por teclado, evalua si est� entre 1 y10, y saca el resultado por pantalla
Entorno: num, numeros reales.
Algoritmo:
	Visualizar "Introduce un n�mero entre 1 y 10"
	Leer num
	Comprobar si num est� enre 1 y 10
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

		System.out.println("Introduce un n�mero entre 1 y 10");
		num = teclado.nextInt();

		if (num >=0 && num <=10) {

			System.out.println("El n�mero " + num +  " es correcto" );
			
		} else {
			System.out.println("El n�mero " + num + " no es correcto");
		}
		teclado.close();
	}
}

