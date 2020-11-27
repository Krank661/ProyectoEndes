/**
 *Programa: Ejercicio3. Programa que calcula la suma de los cuadrados de dos números introducidos por teclado y muestra la solución por pantalla.
 *Entorno: variables x, y. Números enteros.
 *Algoritmo:
 *	Visualizar "Introduce un número"
 *	Leer número
 *	Visualizar "Introduce otro número"
 *	Leer número
 *	Visualizar "La suma de los cuadrados es " 
 *Fin programa
 * 
 * 
 * 
 */
package tanda1;
import java.util.*;
/**
 * @author tardes
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		x = teclado.nextInt();
		
		System.out.println("Introduce otro número");
		y = teclado.nextInt();
		
		System.out.println("La suma de los cuadrados es " + (x*x + y*y));
		
		teclado.close();

	}

}
