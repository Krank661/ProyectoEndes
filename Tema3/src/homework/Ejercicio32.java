/*Programa: Ejercicio32. Programa que calcula la potencia n de x, siendo x cualquier número real distinto de 0 y n cualquier número entero positivo o nulo.
 * Entorno: base, total (números reales), exponente (números enteros).
 * Algoritmo:
 * 	Inicializar variables.
 * 	Visualizar "Introduce la base"
 * 	Leer base
 * 	Visualizar "Introduce el exponente"
 * 	Leer exponente
 * 	Calcular total
 * 	Visualizar base "elevado a " exponente "es" total
 * Fin programa
 * 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 21 nov. 2020
 *
 */
public class Ejercicio32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double base = 0;
		int exponente = 0;
		double total = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la base");
		base = teclado.nextDouble();
		System.out.println("Introduce el exponente");
		exponente = teclado.nextInt();
		
		int i = 0;
		while(i < exponente) {
			total = total + (base * base);
			i--;
		}
		System.out.println(base + " elevado a " + exponente + " es " + total);
		teclado.close();
	}

}
