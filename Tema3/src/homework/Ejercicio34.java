/*Programa: Ejercicio34. Programa que imprime números en un determinado patrón 
 *Entorno: num(números enteros).
 *Algoritmo:
 *	Inicializar variables.
 *	Bucle:
 *		se repite 9 veces
 *		Bucle:
 *			visualizar num
 *			incremento
 *Fin programa 
 */
package homework;

/**
 * @author PC Ana Caballero
 * date: 21 nov. 2020
 *
 */
public class Ejercicio34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int i;
		num = 1;
		while(num <= 9) {
			i = 1;
			while(i <= num) {
				System.out.print(i);
				i++;
			}
			System.out.println();
			num++;
		}


	}

}
