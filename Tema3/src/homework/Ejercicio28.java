/*Programa: Ejercicio28. Programa que calcula y visualiza las potencias de 2 entre 0 y 10.
 *Entorno: num, total. Números reales.
 *Algoritmo:
 *	Inicializar variables
 *	Bucle de incremento que visualiza una de las potencias por cada iteración.
 *Fin programa.
 * 
 */
package homework;

/**
 * @author PC Ana Caballero
 * date: 12 nov. 2020
 *
 */
public class Ejercicio28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double total = 0;
		
		for(int i = 0; i <= 10; i++) {
			total = Math.pow(2, i);
			System.out.println("2 elevado a " + i + " es " + total);
		}
	}

}


