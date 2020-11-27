/*Programa: Ejercicio25. Programa que muestra una serie de números distintos de cero y la cantidad de números mostrada.
 *Entorno: total. Números enteros.
 *Algoritmo:
 *	Establecer número inicial
 *	Bucle de decremento
 *	Visualizar total de números
 *Fin programa
 * 
 */
package tanda8;

/**
 * @author tardes Ana Caballero Álvarez
 * 11 nov. 2020
 */
public class Ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for(int i = 20; i > 0; i--) {
			System.out.println(i);
			total+=1;
		}
		System.out.println("La cantidad de valores es " + total);

	}

}
