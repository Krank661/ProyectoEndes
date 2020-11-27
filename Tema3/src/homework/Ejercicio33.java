/*Programa: Ejercicio33. Programa que lee un número entero positivi y calcula su factorial.
 *Entorno: num, total (números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce un número entero positivo"
 *	Leer num
 *	Bucle :
 *		de num a 0
 *		total = total + (num * contador i)
 *	Visualizar "El factorial de " num " es " total
 *Fin programa
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 21 nov. 2020
 *
 */
public class Ejercicio33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;		
		int total = 1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero positivo");
		num = teclado.nextInt();		
				
		for(int i = num; i > 0; i--) {	
			total = total * i;
		}
		System.out.println("El factorial de " + num + " es " + total);
		teclado.close();
		//no funciona para num = 4
	}

}
