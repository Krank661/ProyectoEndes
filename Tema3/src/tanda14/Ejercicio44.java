/*Programa: Ejercicio44. Programa que lee y visualiza caracteres
 *Entorno: letra (caracteres)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle  do while:
 *		 Mientras letra sea distinto de *:
 *			Visualizar "Introduce un caracter ( * para finalizar)"
 *			Leer letra
 *			Imprimir letra		
 *Fin programa 
 */
package tanda14;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 25 nov. 2020
 */
public class Ejercicio44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char letra = 'a';
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduce un caracter ( * para finalizar)");
			letra = teclado.next().charAt(0);

			System.out.println(letra);
		} while(letra != '*');
		teclado.close();
	}


}

