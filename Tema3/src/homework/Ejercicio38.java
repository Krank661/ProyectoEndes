/*Programa: Ejercicio38. Programa que lee 10 números enteros y determina si hay algún 5
 *Entorno: num(números enteros), con(booleano)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle:
 *		Se repite 10 veces
 *		Visualizar "Introduce un número"
 *		Leer num
 *		Si num es 5 cond pasa a true
 *	Visualizar "Hay por lo menos un 5" o "No hay ningún 5"
 *Fin programa 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 21 nov. 2020
 *
 */
public class Ejercicio38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		boolean con = false;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce un número");
			num = teclado.nextInt();
			if(num == 5) {
				con = true;
			}
		}
		if(con == true) {
			System.out.println("Hay por lo menos un 5");
		} else {
			System.out.println("No hay ningún 5");
		}
		teclado.close();
	}

}
