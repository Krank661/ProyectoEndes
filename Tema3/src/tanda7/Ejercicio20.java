/*Programa: Ejercicio20. Programa que recibe tres n�meros enteros por teclado y muestra sus relaciones de igualdad.
 *Entorno: num1, num2, num3. N�meros enteros.
 *Algoritmo:
 *	Visualizar "Introduce el primer n�mero"
 *	Leer num1
 *	Visualizar "Introduce el segundo n�mero"
 *	Leer num2
 *	Visualizar "Introduce el tercer n�mero"
 *	Leer num3
 *	Bucle de comparaci�n
 *	Visualizar igualdades
 *Fin programa 
 */
package tanda7;
import java.util.*;
/**
 * @author tardes Ana Caballero �lvarez
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
		
		System.out.println("Introduce el primer n�mero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo n�mero");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer n�mero");
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
