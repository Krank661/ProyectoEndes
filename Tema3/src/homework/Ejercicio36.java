/*Programa: Ejercicio36. Programa que visualiza la tabla de multiplicar del 5
 *Entorno: num, res(números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Tabla del 5"
 *	Bucle
 *		se repite 10 veces
 *		res = num * i
 *		Visualizar res
 *Fin programa
 * 
 */
package homework;

/**
 * @author PC Ana Caballero
 * date: 21 nov. 2020
 *
 */
public class Ejercicio36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 5;
		int res = 0;
		System.out.println("Tabla del " + num);
		for(int i = 1; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " x " + i + " = " + res);

		}

	}

}
