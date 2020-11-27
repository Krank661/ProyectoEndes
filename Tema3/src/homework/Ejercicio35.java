/*Programa: Ejercicio35. Programa que permite elegir entre un menu de opciones.
 *Entorno: respuesta(números enteros).
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar opciones
 *	Visualizar "Elige una opción"
 *	Leer respuesta
 *	Visualizar la opción elegida
 *Fin programa	
 * 
 */
package homework;
import java.util.*;
/**
 * @author PC Ana Caballero
 * date: 21 nov. 2020
 *
 */
public class Ejercicio35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int respuesta = 0;
		Scanner teclado = new Scanner(System.in);


		do {
			System.out.println("1.- Altas");
			System.out.println("2.- Bajas");
			System.out.println("3.- Modificaciones");
			System.out.println("4.- Consultas");
			System.out.println("5.- Salir");
			System.out.println("Elige una opción");
			respuesta = teclado.nextInt();

			switch(respuesta) {
			case 1:
				System.out.println("Altas");
				break;
			case 2:
				System.out.println("Bajas");
				break;
			case 3:
				System.out.println("Modificaciones");
				break;
			case 4:
				System.out.println("Consultas");
			}
		}


		while(respuesta > 0 && respuesta < 5); 
		teclado.close();

	}
}
