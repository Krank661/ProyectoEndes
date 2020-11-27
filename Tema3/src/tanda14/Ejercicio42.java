/*Programa: Ejercicio42. Programa que visualiza los números impares entre 1 y 150
 *Entorno: num (números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle while:
 *		Mientras num sea menor o igual que 150
 *		Si num es impar imprimir num
 *Fin programa
 * 
 */
package tanda14;

/**
 * @author tardes Ana Caballero Álvarez
 * 25 nov. 2020
 */
public class Ejercicio42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		
		while(num <= 150) {
			if(num % 2 != 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
