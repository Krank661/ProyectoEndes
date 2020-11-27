/*Programa: Ejercicio41. Programa que visualiza los números pares ente 1 y 100
 *Entorno: num (números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle while:
 *		Mientras num sea menor o igual que 100
 *		Si num es par imprimir num
 *Fin programa
 */
package tanda14;

/**
 * @author tardes Ana Caballero Álvarez
 * 25 nov. 2020
 */
public class Ejercicio41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 1;
		
		while(num <= 100) {
			if(num % 2 == 0) {
				System.out.println(num);				
			}
			num++;
		}

	}

}
