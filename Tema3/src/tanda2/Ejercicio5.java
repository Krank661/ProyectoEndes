//
//  Programa: Ejercicio 5. Programa para facturas de productos con descuento e IVA.
//  Entorno: precioin, iva, descuento, preciofin. Números reales.
//  Algoritmo:
//  	Visualizar "Introduce el precio de un artículo"
//  	Leer precioin
//  	Calcular el IVA
//  	Guardar Iva en la variable iva
//  	Calcular el descuento
//  	Guardar el descuento en la variable descuento
//  	Calcular el precio final
//  	Guardar el precio final en la variable preciofin
//  	Visualizar el precio final
//	Fin programa	
// 
package tanda2;
import java.util.*;

/**
 * @author tardes
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double precioin;
		double iva;
		double descuento;
		double preciofin;
		
		System.out.println("Introduce el precio de un artículo");
		precioin = teclado.nextDouble();
		
		iva = precioin*21/100;
		descuento = precioin*15/100;
		preciofin = precioin + iva - descuento;
		
		System.out.println("El precio es" + precioin);
		System.out.println("El IVA es " + iva);
		System.out.println("El descuento es " + descuento);
		System.out.println("El precio final es " + preciofin);
		
		teclado.close();	
		

	}

}
