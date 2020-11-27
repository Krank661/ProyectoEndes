/*Programa: ejerciciodos. Programa que lee tres números, comprueba si alguno de ellos es la suma de los otros dos y visualiza el resultado.
 *Entorno: num1, num2, num3. Números enteros.
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce el primer número"
 *	Leer num1
 * 	Visualizar "Introduce el segundo número"
 *	Leer num2
 *	Visualizar "Introduce el tercer número"
 *	Leer num3
 *	Comparación de num1, num2, num3
 *	Visualizar "Cumple la condición" o "No cumple la condición"
 *Fin programa
 */
package examen;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 12 nov. 2020
 */
public class ejerciciodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número");
		num3 = teclado.nextInt();
		
		if(num1 + num2 == num3) {
			System.out.println("Cumple la condición");
		} else if(num1 + num2 == num3) {
			System.out.println("Cumple la condición");
		} else if(num2 + num3 == num1) {
			System.out.println("Cumple la condición");
		} else {
			System.out.println("No cumple la condición");
		}
		teclado.close();

	}

}
