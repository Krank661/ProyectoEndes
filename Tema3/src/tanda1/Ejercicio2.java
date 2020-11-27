/**
 * Programa: Ejercicio2. Programa que calcula el �rea de un rect�ngulo
 * Entorno: variables base, altura, area; numeros enteros.
 * Algoritmo
 * 		Visualizar "Introduce la base"
 * 		Leer base
 * 		Visualizar "Introduce la altura"
 * 		Leer altura
 * 		Calcular �rea (base por altura)
 * 		Guardar �rea en la variable
 * 		Visualizar "El �rea es "  �rea
 * Fin programa
 */
package tanda1;
import java.util.*;
/**
 * @author tardes
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base;
		int altura;
		int area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la base");
		base = teclado.nextInt();
		
		System.out.println("Introduce la altura");
		altura = teclado.nextInt();
		
		area = base*altura;
		
		System.out.println("El �rea es " + area);
		
		teclado.close();
	}

}
