/*Programa: Ejercicio31. Programa que lee 10 números y determina cuántos de ellos son positivos.
 *Entornos: num, total. Números enteros.
 *Algoritmo:
 *	Inicializar variables
 *	Bucle for:
 *		Visualizar "Introduce un número"
 *		Si es positivo, incrementar total	
 *	Visualizar "El total de números positivos es " + total
 *Fin programa
 * 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 18 nov. 2020
 *
 */
public class Ejercicio31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		int total = 0;
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce un número");
			num = teclado.nextInt();
			if(num > 0) {
				total ++;
			}

		}
		System.out.println("El total de números positivos es " + total);
		teclado.close();

	}	

}
