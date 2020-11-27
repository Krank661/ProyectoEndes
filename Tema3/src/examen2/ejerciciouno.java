/*Programa: ejerciciouno. Programa que lee una cantidad de edades y realiza calculos sobre elllas
 *Entorno: edad, menor18, mayor18, mayor45, mayor65, contador1, contador2, contador3, contador4 (números enteros)
 *Algoritmo:
 *	Inicializar variables
 *	Bucle:
 *		Se repite 10 veces
 *		Visualizar "Introduzca edad"
 *		Leer edad
 *		Si edad es menor que 18, sumar edad a menor18 e incrementar contador1
 *		Si edad está entre 18 y 45, sumar edad a mayor18 e incrementar contador2
 *		Si edad está entre 46 y 65, sumar edad a mayor45 e incrementar contador3
 *		Si edad es mayor que 65, sumar edad a mayor65 e incrementar contador4
 *	Visualizar "La media de edad de las personas menores de 18 es: " (menor18/contador1)
 *	Visualizar "La media de edad de las personas con edades entre 18  y 45 es: " (mayor18/contador2)
 *	Visualizar "La media de edad de las personas con edades entre 46 y 65 es: " (mayor45/contador3)
 *	Visualizar "La media de edad de las personas mayores de 65 es: " (mayor65/contador4)
 *	Visualizar "La mayor población es la de "
 *Fin programa 
 */
package examen2;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 23 nov. 2020
 */
public class ejerciciouno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int edad = 0, menor18 = 0, mayor18 = 0, mayor45 = 0, mayor65 = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			System.out.println("Introduzca edad");
			edad = teclado.nextInt();
			if(edad < 18) {
				menor18 = menor18 + edad;
				contador1++;				
			} else if(edad >=18 && edad <= 45) {
				mayor18 = mayor18 + edad;
				contador2++;
			} else if(edad > 45 && edad <= 65) {
				mayor45 = mayor45 + edad;
				contador3++;
			} else {
				mayor65 = mayor65 + edad;
				contador4++;
			}
		}
		if(contador1 != 0) {
			System.out.println("La media de edad de las personas menores de 18 es: " + (menor18/contador1));
		}
		if(contador2 != 0) {
			System.out.println("La media de edad de las personas con edades entre 18  y 45 es: " + (mayor18/contador2)); 
		}
		if(contador3 != 0) {
			System.out.println("La media de edad de las personas con edades entre 46 y 65 es: " + (mayor45/contador3));
		}
		if(contador4 != 0) {
			System.out.println("La media de edad de las personas mayores de 65 es: " + (mayor65/contador4));
		}
		if(contador1 > contador2) {
			if(contador1 > contador3) {
				if(contador1 > contador4) {
					System.out.println("La mayor población es la de menos de 18 años");
				}
			}

		}
		else if(contador2 > contador1) {
			if(contador2 > contador3) {
				if(contador2 > contador4) {
					System.out.println("La mayor población está entre los 18 y los 45 años");
				}
			}
		}
		else if (contador3 > contador1) {
			if(contador3 > contador2) {
				if(contador3 > contador4) {
					System.out.println("La mayor población está entre los 46 y los 65 años");
				}
			}
		}
		else {
			System.out.println("La mayor población es la de más de 65 años");
		}
		teclado.close();
	}

}
