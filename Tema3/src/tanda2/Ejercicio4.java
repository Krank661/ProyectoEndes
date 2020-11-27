/**
 * Programa: Ejercicio 4. Programa que calcula el 10% de un n�mero introducido por teclado y lo presenta por pantalla.
 * Entorno: numero. N�meros reales.
 * Algortimo: 
 * 	Visualizar "Introduce un n�mero"
 * 	Leer n�mero
 * 	Visualizar "El 10% de tu n�mero es " resultado
 * Fin programa
 */
package tanda2;
import java.util.*;
/**
 * @author tardes
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un n�mero");
		numero = teclado.nextFloat();
		
		System.out.println("El 10% de tu n�mero es " + (numero/10));
		
		teclado.close();

	}

}
