/**
 *Programa: Ejercicio3. Programa que calcula la suma de los cuadrados de dos n�meros introducidos por teclado y muestra la soluci�n por pantalla.
 *Entorno: variables x, y. N�meros enteros.
 *Algoritmo:
 *	Visualizar "Introduce un n�mero"
 *	Leer n�mero
 *	Visualizar "Introduce otro n�mero"
 *	Leer n�mero
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
		
		System.out.println("Introduce un n�mero");
		x = teclado.nextInt();
		
		System.out.println("Introduce otro n�mero");
		y = teclado.nextInt();
		
		System.out.println("La suma de los cuadrados es " + (x*x + y*y));
		
		teclado.close();

	}

}
