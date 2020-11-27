/**
 * Programa: Ejercicio 4. Programa que calcula el 10% de un número introducido por teclado y lo presenta por pantalla.
 * Entorno: numero. Números reales.
 * Algortimo: 
 * 	Visualizar "Introduce un número"
 * 	Leer número
 * 	Visualizar "El 10% de tu número es " resultado
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
		
		System.out.println("Introduce un número");
		numero = teclado.nextFloat();
		
		System.out.println("El 10% de tu número es " + (numero/10));
		
		teclado.close();

	}

}
