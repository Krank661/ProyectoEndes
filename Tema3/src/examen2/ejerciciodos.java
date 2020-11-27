/*Programa: ejerciciodos. Programa que lee dos números y muestra los números comprendidos entre ellos
 *Entorno: num1, num2 (números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce el primer número"
 *	Leer num1
 *	Visualizar "Introduce el segundo número"
 *	Leer num2
 *	Si num1 es menor que num2
 *		Bucle:
 *			Mientras num1 sea menor que num2, visualizar e incrementar num1
 *	Si num1 es mayor que num2
 *		Bucle:
 *			Mientras num1 sea mayor que num2, visualizar y disminuir num2 
 *Fin programa	
 * 
 */
package examen2;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 23 nov. 2020
 */
public class ejerciciodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = teclado.nextInt();
		
		if(num1 < num2) {
			while(num1 <= num2) {
				System.out.println(num1);
				num1++;
			}
		} else if(num1 > num2) {
			while (num1 >= num2) {
				System.out.println(num1);
				num1--;
			}
		} else {
			System.out.println("Los dos números son iguales");
		}
		teclado.close();

	}

}
