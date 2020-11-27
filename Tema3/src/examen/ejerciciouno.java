/*Programa: ejerciciouno. Programa que lee dos n�meros, realiza la resa (mayor - menor) y visualiza el resultado.
 *Entorno: a, b, res. N�meros enteros.
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce un n�mero"
 *	Leer a
 *	Visualizar "Introduce otro n�mero"
 *	Leer b
 *	Calcular res
 *	Visualizar res
 *Fin programa
 * 
 */
package examen;
import java.util.*;
/**
 * @author tardes Ana Caballero �lvarez
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
		
		System.out.println("Introduce un n�mero");
		a = teclado.nextInt();
		System.out.println("Introduce otro n�mero");
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
