/*Programa: Ejercicio37. Programa que visualiza las tablas de multiplicar del 1 al 9
 *Entorno: num, total (números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle:
 *		Se repite 9 veces
 *		Visualizar "Tabla del " num
 *		Bucle:
 *			Se repite 10 veces
 *			total = num * i
 *			visualizar total
 *Fin programa
 * 
 */
package homework;

/**
 * @author PC Ana Caballero
 * date: 21 nov. 2020
 *
 */
public class Ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 1;
		int total = 0;
		
		while(num <= 9) {
			System.out.println("Tabla del " + num);
			for(int i = 1; i <= 10; i++) {
				total = num * i;
				System.out.println(num + " x " + i + " = " + total);
			}
			num++;
		}

	}

}
