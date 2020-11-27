/*Programa: Ejercicio40. Programa que lee 10 caracteres y cuenta las veces que se repite el primero de ellos
 *Entorno: total (números enteros), inicio, letra (caracteres)
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduce una letra"
 *	Leer inicio
 *	Bucle:
 *		Se repite 9 veces
 *		Visualizar "Introduce una letra"
 *		Si letra = inicio, incrementar total
 *	Visualizar "El primer caracter aparece " total " veces"
 *Fin programa
 *		
 * 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 22 nov. 2020
 *
 */
public class Ejercicio40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 1;
		char letra;
		char inicio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una letra");
		inicio = teclado.next().charAt(0);
		
		for(int i = 0; i < 9; i++) {
			System.out.println("Introduce una letra");
			letra = teclado.next().charAt(0);
			if(letra == inicio) {
				total += 1;
			}
		}
		System.out.println("El primer caracter aparece " + total + " veces");
		teclado.close();

	}

}
