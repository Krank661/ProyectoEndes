/*Programa: Ejercicio21. Programa que recibe una hora en horas, minutos y segundos, y muestra la misma hora pasado un segundo.
 *Entorno: hora, min, seg. Números enteros entre 0 y 59.
 *Algoritmo:
 *	Visualizar "Introduce la hora"
 *	Leer hora
 *	Visualizar "Introduce los minutos"
 *	Leer min
 *	Visualizar "Introduce los segundos"
 *	Leer seg
 *	Incremento
 *	Visualizar resultado
 *Fin programa
 * 	
 */
package tanda7;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 9 nov. 2020
 */
public class Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hora = 0;
		int min = 0;
		int seg = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la hora");
		hora = teclado.nextInt();
		System.out.println("Introduce los minutos");
		min = teclado.nextInt();
		System.out.println("Introduce los segundos");
		seg = teclado.nextInt();
		
		if((seg+=1) < 60) {
			System.out.println("La hora es " + hora + " horas " + min + " minutos " + (seg+=1) + " segundos");
		} else if((seg+=1) == 60) {
			if((min+=1) < 60) {
				seg = 0;
				System.out.println("La hora es " + hora + " horas " + (min+=1) + " minutos " + seg);
			} else if((min+=1) == 60) {
				if((hora+=1) < 24) {
					seg = 0;
					min = 0;
					System.out.println(" La hora es " + (hora+=1) + " horas " + min + " minutos " + seg + " segundos");
				} else if((hora+=1) == 24) {
					seg = 0;
					min = 0;
					hora = 0;
					System.out.println(" La hora es " + hora + " horas " + min + " minutos " + seg + " segundos");
				}
			}
		}
		teclado.close();

	}
}


