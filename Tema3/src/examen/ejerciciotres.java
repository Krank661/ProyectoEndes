/*Programa: ejerciciotres. Programa que visualiza el valor de una factura a partir del valor de cada paso, el número de pasos y un posible descuento.
 *Entorno: pasosCantidad, pasosValor, descuento, total. Números reales.
 *Algoritmo:
 *	Inicializar variables.
 *	Visualizar "Introduce la cantidad de pasos consumidos"
 *	Leer pasosCantidad
 *	
 */
package examen;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 12 nov. 2020
 */
public class ejerciciotres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int pasosCantidad = 0;
		final double PASOS_VALOR = 0.1;
		double descuento = 0;
		double total = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de pasos consumidos");
		pasosCantidad = teclado.nextInt();
		
		
		if(pasosCantidad <= 0) {
			System.out.println("Error");
		}
		else if(pasosCantidad <= 1000) {
			total = (pasosCantidad * PASOS_VALOR);
			System.out.println("El total es " + total + " €");
		} else {
			total = (pasosCantidad * PASOS_VALOR);
			descuento = (total * 1.8);
			total = (total - descuento);
		}
		teclado.close();
	
	}

}
