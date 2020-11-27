/**
Programa: ejercicio1
Programa que recibe el nombre y los apellidos por teclado y los muestra en pantalla

Entorno: variable nombre para almacenar el nombre
	variable apellAidos para almacenar los apellidos; cadenas de caracteres
	
algoritmo
	Visualizar "Introduce tu nombre"
	Leer nombre
	Visualizar "Introduce tus apellidos"
	Leer apellidos
	Visualizr "Tu nombre es " nombre + apellidos
Fin programa

 * 
 */
package tanda1;
import java.util.*;

/**
 * @author tardes
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String apellidos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce tus apellidos");
		apellidos = teclado.nextLine();
		
		System.out.println("Tu nombre es " + nombre +" " + apellidos);
		
		teclado.close();
	}

}
