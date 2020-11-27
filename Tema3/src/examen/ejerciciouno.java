/*Programa: ejerciciouno. Programa que lee dos números, realiza la resa (mayor - menor) y visualiza el resultado.
 *Entorno: a, b, res. Números enteros.
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce un número"
 *	Leer a
 *	Visualizar "Introduce otro número"
 *	Leer b
 *	Calcular res
 *	Visualizar res
 *Fin programa
 * 
 */
package examen;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 12 nov. 2020
 */
public class ejerciciouno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int res = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		a = teclado.nextInt();
		System.out.println("Introduce otro número");
		b = teclado.nextInt();
				
		if(b > a) {
			res = (b - a);
			System.out.println("El resultado es " + res);			
		} else if (a > b) {
			res = (a - b);
			System.out.println("El resultado es " + res);
		} else {
			System.out.println("a y b son iguales");
		}
		teclado.close();

	}

}
