/*Programa: Ejercicio20. Programa que recibe tres números enteros por teclado y muestra sus relaciones de igualdad.
 *Entorno: num1, num2, num3. Números enteros.
 *Algoritmo:
 *	Visualizar "Introduce el primer número"
 *	Leer num1
 *	Visualizar "Introduce el segundo número"
 *	Leer num2
 *	Visualizar "Introduce el tercer número"
 *	Leer num3
 *	Bucle de comparación
 *	Visualizar igualdades
 *Fin programa 
 */
package tanda7;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 9 nov. 2020
 */
public class Ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número");
		num3 = teclado.nextInt();
		
		if((num1 == num2) && (num1 != num3)) {
			System.out.println(num1 + " y " + num2 + " son iguales");
		} else if((num1 == num3) && (num1 != num2)) {
			System.out.println(num1 + " y " + num3 + " son iguales");
		} else if((num2 == num3) && (num2 != num1)) {
			System.out.println(num2 + " y " + num3 + " son iguales");
		} else if ((num1 == num2) && (num1 == num3)) {
			System.out.println(num1 + " y " + num2 + " y " + num3 + " son iguales");
		} else if ((num1 != num2) && (num2 != num3)) {
			System.out.println(num1 + " y " + num2 + " y " + num3 + " son distintos");
		}
		
		teclado.close();

	}

}
