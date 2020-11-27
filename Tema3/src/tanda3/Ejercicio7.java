/*
Programa: Ejercicio7. Programa que resuelve una ecuación de segundo grado.
Entorno: números reales.
Algoritmo:
	Visualizar "Introduce el valor de a"
	Leer a
	Visualizar "Introduce el valor de b"
	Leer b
	Visualizar "Introduce el valor de c"
	Leer c
	Calcular la primera solución de x
	Calcular la segunda solución de x
	Visualizar "La primera solución de x es " x1
	Visualizar "La segunda solución de x es " x2
Fin programa
	


*/
package tanda3;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a;
		int b;
		int c;
		double x1;
		double x2;
		
		System.out.println("Introduce el valor de a");
		a = teclado.nextInt();		
		System.out.println("Introduce el valor de b");
		b = teclado.nextInt();
		System.out.println("Introduce el valor de c");
		c = teclado.nextInt();
		
		x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
		x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
		
	System.out.println("La primera solución de x es" + x1);
	System.out.println("La segunda solución de x es" + x2);
	
	teclado.close();

	}

}
