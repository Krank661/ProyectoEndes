/*Programa: Ejercicio31. Programa que lee 10 n�meros y determina cu�ntos de ellos son positivos.
 *Entornos: num, total. N�meros enteros.
 *Algoritmo:
 *	Inicializar variables
 *	Bucle for:
 *		Visualizar "Introduce un n�mero"
 *		Si es positivo, incrementar total	
 *	Visualizar "El total de n�meros positivos es " + total
 *Fin programa
 * 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 18 nov. 2020
 *
 */
public class Ejercicio31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		int total = 0;
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce un n�mero");
			num = teclado.nextInt();
			if(num > 0) {
				total ++;
			}

		}
		System.out.println("El total de n�meros positivos es " + total);
		teclado.close();

	}	

}
