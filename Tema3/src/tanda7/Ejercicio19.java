/*Programa: Ejercicio19. Programa que recibe tres números por teclado y determina el mayor de los tres.
 *Entorno: num1, num2, num3. Números reales.
 *Algoritmo:
 *	Visualizar "Introduce el primer número"
 *	Leer num1
 * 	Visualizar "Introduce el segundo número"
 *	Leer num2
 *	Visualizar "Introduce el tercer número"
 *	Leer num3
 *	Bucle de comparación
 *	Visualizar el número mayor
 *Fin programa
 */
package tanda7;
import java.util.*;


/**
 * @author tardes Ana Caballero Álvarez
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
		
		System.out.println("Introduce el primer número");
		num1 = teclado.nextDouble();
		System.out.println("Introduce el segundo número");
		num2 = teclado.nextDouble();
		System.out.println("Introduce el tercer número");
		num3 = teclado.nextDouble();
		
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("Tienen que ser números distintos");
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
