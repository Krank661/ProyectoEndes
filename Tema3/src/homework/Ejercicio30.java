/*Programa: Ejercicio30. Programa que lee n�meros enteros positivos distintos de cero y obtiene el mayor.
 *Entorno: num, mayor (n�meros enteros) 
 *Algoritmo:
 *	Inicializar variables
 *	Loop while el valor no es 99:
 *		Visualizar "Introduce un n�mero entero mayor que zero"
 *		Leer inicio
 *	Comparaci�n
 *	Visualizar "El n�mero mayor es "
 *Fin programa 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 18 nov. 2020
 *
 */
public class Ejercicio30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int mayor = 0;

		System.out.println("Introduce un n�mero distinto de 0");
		mayor = teclado.nextInt();

		if(mayor != 99) {
			while(num> 0 && num != -99) {
				System.out.println("Introduce un n�mero distinto de 0");
				num = teclado.nextInt();
				if(num >= mayor) {
					mayor = num;
				}
				System.out.println("El n�mero mayor es " + mayor);

			} 
		} else {
			System.out.println("El n�mero mayor es " + mayor);
		}
		teclado.close();
	}

}
