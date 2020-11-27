/*Programa: Ejercicio29. Programa que suma de forma independiente los n�meros pares e impares y muestra los resultados.
 * Entorno: totalPar, totalImpar. N�meros enteros.
 * Algoritmo:
 * 	Inicializar variables.
 * 	Bucle for.
 * 	Visualizar resultados.
 * Fin programa.
 * 
 */
package homework;

/**
 * @author PC Ana Caballero
 * date: 18 nov. 2020
 *
 */
public class Ejercicio29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int totalPar = 0;
		int totalImpar = 0;
		
		for(int i = 0; i < 200; i++) {
			if(i % 2 == 0) {
				totalPar += i;
			} else {
				totalImpar += i;
			}
		}
		System.out.println("La suma total de los n�meros pares es " + totalPar);
		System.out.println("La suma total de los n�meros impares es " + totalImpar);
		

	}

}
