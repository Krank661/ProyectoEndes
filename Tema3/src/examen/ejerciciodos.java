/*Programa: ejerciciodos. Programa que lee tres n�meros, comprueba si alguno de ellos es la suma de los otros dos y visualiza el resultado.
 *Entorno: num1, num2, num3. N�meros enteros.
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce el primer n�mero"
 *	Leer num1
 * 	Visualizar "Introduce el segundo n�mero"
 *	Leer num2
 *	Visualizar "Introduce el tercer n�mero"
 *	Leer num3
 *	Comparaci�n de num1, num2, num3
 *	Visualizar "Cumple la condici�n" o "No cumple la condici�n"
 *Fin programa
 */
package examen;
import java.util.*;
/**
 * @author tardes Ana Caballero �lvarez
 * 12 nov. 2020
 */
public class ejerciciodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo n�mero");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer n�mero");
		num3 = teclado.nextInt();
		
		if(num1 + num2 == num3) {
			System.out.println("Cumple la condici�n");
		} else if(num1 + num2 == num3) {
			System.out.println("Cumple la condici�n");
		} else if(num2 + num3 == num1) {
			System.out.println("Cumple la condici�n");
		} else {
			System.out.println("No cumple la condici�n");
		}
		teclado.close();

	}

}
