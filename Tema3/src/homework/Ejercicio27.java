/*Programa: Ejercicio27. Programa que lee un número y determina si es o no un número primo.
 *Entorno: num. Números enteros.
 *Algoritmo:
 *	Inicializar variables.
 *	Visualizar "Introduce un número"
 *	Leer num
 *	Comparación
 *	Visualizar resultado
 *Fin programa.
 * 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 17 nov. 2020
 *
 */
public class Ejercicio27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;		
		boolean primo = true;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		num = teclado.nextInt();		
		
		int i = 2;
		while((i/2) < num) {
			if (num % i == 0) {
				primo = false;
			} else {
				primo = true;
			}
		}
		if(primo == true) {
			System.out.println(num + " es un número primo");
		} else {
			System.out.println(num + " no es un número primo");
		}
		teclado.close();

	}

}
