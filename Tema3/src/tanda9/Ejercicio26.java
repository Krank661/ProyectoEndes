/*Programa: Ejercicio26. Programa que muestra por pantalla los múltiplos de 3 entre 3 y 99.
 *Entorno: suma, total. Números enteros.
 *Algoritmo:
 *	Inicialización de variables
 *	Bucle de incremento
 *	Visualizar los múltiplos
 *	Visualizar la suma
 *Fin programa
 *	
 *Fin programa
 */

package tanda9;

/**
 * @author tardes Ana Caballero Álvarez
 * 11 nov. 2020
 */
public class Ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int suma = 0;		
		int total = 0;
		
		while (suma < 99) {
			suma = suma + 3;
			total = total + suma;
			
			System.out.println(suma);
		}
		System.out.println("La suma total es " + total);
	}

}
