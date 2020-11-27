/*Programa: Ejercicio43. Programa que visualiza los múltiplos de 5 entre 1 y 200
 *Entorno: num (números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle while:
 *		Mientras num sea menor o igual que 200
 *		Si num es divisible entre 5 imprimir num
 *Fin programa
 * 
 */
package tanda14;

/**
 * @author tardes Ana Caballero Álvarez
 * 25 nov. 2020
 */
public class Ejercicio43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		
		while(num <= 200) {
			if(num % 5 == 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
