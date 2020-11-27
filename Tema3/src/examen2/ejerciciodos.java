/*Programa: ejerciciodos. Programa que lee dos n�meros y muestra los n�meros comprendidos entre ellos
 *Entorno: num1, num2 (n�meros enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce el primer n�mero"
 *	Leer num1
 *	Visualizar "Introduce el segundo n�mero"
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
 * @author tardes Ana Caballero �lvarez
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
		
		System.out.println("Introduce el primer n�mero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo n�mero");
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
			System.out.println("Los dos n�meros son iguales");
		}
		teclado.close();

	}

}
