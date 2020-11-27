/*Programa: Ejercicio25. Programa que muestra una serie de n�meros distintos de cero y la cantidad de n�meros mostrada.
 *Entorno: total. N�meros enteros.
 *Algoritmo:
 *	Establecer n�mero inicial
 *	Bucle de decremento
 *	Visualizar total de n�meros
 *Fin programa
 * 
 */
package tanda8;

/**
 * @author tardes Ana Caballero �lvarez
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
