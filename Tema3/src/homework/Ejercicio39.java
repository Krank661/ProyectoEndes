/*Programa: Ejercicio39. Programa que lee 10 caracteres y cuenta el número de vocales
 *Entorno: letra(caracteres), total(números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle:
 *		Visualizar "Introduce una letra"
 *		Leer letra
 *		Switch
 *			si letra es una vocal aumentar total
 *		Visualizar "El número de vocales es" total
 *Fin programa
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 22 nov. 2020
 *
 */
public class Ejercicio39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		char letra;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce una letra");
			letra = teclado.next().charAt(0);
			
			switch(letra) {
			case 'a':
				total += 1;
				break;
			case 'e':
				total += 1;
				break;
			case 'i':
				total += 1;
				break;
			case 'o':
				total += 1;
				break;
			case 'u':
				total += 1;
				break;
			default:
				break;
			}
		System.out.println("El número de vocales es " + total);
		teclado.close();
		
		}

	}

}
