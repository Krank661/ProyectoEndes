/*Programa: Ejercicio19. Programa que recibe tres n�meros por teclado y determina el mayor de los tres.
 *Entorno: num1, num2, num3. N�meros reales.
 *Algoritmo:
 *	Visualizar "Introduce el primer n�mero"
 *	Leer num1
 * 	Visualizar "Introduce el segundo n�mero"
 *	Leer num2
 *	Visualizar "Introduce el tercer n�mero"
 *	Leer num3
 *	Bucle de comparaci�n
 *	Visualizar el n�mero mayor
 *Fin programa
 */
package tanda7;
import java.util.*;


/**
 * @author tardes Ana Caballero �lvarez
 * 9 nov. 2020
 */
public class Ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero");
		num1 = teclado.nextDouble();
		System.out.println("Introduce el segundo n�mero");
		num2 = teclado.nextDouble();
		System.out.println("Introduce el tercer n�mero");
		num3 = teclado.nextDouble();
		
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("Tienen que ser n�meros distintos");
		} else if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " es el mayor");
		} else if (num2 > num1 && num1 > num3) {
			System.out.println(num2 + " es el mayor ");
		} else if (num3 > num1 &&num3 > num2) {
			System.out.println(num3 + " es el mayor");
		}
		teclado.close();
	}

}
